import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { OrderAdminService } from 'src/app/Modules/admin/adminServices/order-admin.service';
import { OrderDetailAdminService } from 'src/app/Modules/admin/adminServices/order-detail-admin.service';
import { CustomerUserService } from '../../userServices/customer-user.service';
import { OrderDetailUserService } from '../../userServices/order-detail-user.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  formAddCustomer = this.fb.group({
    fullName: ['', Validators.required],
    address: ['', Validators.required],
    phone: ['', Validators.required],
    email: ['', Validators.required],
  });

  submitted = false;
  constructor(private fb: FormBuilder,
    private route: ActivatedRoute,
     private customerService: CustomerUserService,
     private orderService: OrderAdminService,
     private orderDetailService: OrderDetailAdminService,
     private router: Router,
     private http: HttpClient) {  }

  data: any[] = [];

  ngOnInit(): void {
    this.loadCart();
    this.loadTotal();
    let id = this.route.snapshot.params['customerId'];
    this.customerService.findById(id).subscribe(res => console.log(res));
  }

  customerInfo: any = null;

  orderAdded: any = null;

  orderDetailAdded: any[] = [];

  customerAdded: any = null;
  customerOnlyId: any = null;
  promotionCode: any = null;
  addCustomer(){
    this.customerService.add(this.formAddCustomer.value).subscribe(res=>{
      this.customerAdded = res;
      this.customerOnlyId = {customerId: this.customerAdded.customerId}
      this.orderService.add(
        {
          fullName: this.customerAdded.fullName,
          phone: this.customerAdded.phone,
          address: this.customerAdded.address,
          email: this.customerAdded.email,
          total: this.subtotal + 50000,
          customer: this.customerOnlyId,
          promotion: {promotionId: 1}
        }
      ).subscribe(res2=>{
        this.orderAdded = res2;
        console.log(this.orderAdded)



        for(let c of this.data){
          let p = c.product;
          console.log(p)
            this.orderDetailService.add(
              {
                order: { orderId: this.orderAdded.orderId},
                product: { productId: p.productId},
                color: p.color,
                quantity: c.quantity,
                price: p.price
              }
            ).subscribe(res3=>{
              this.orderDetailAdded = res3;
              console.log(this.orderDetailAdded)
            })
        }



        // this.router.navigateByUrl('/admin/listOrders')
      })
      // this.router.navigate(['congratulation']);
    })
  }

  loadCart(){
    // Lấy dữ liệu giỏ hàng trong storage
    this.data = localStorage.getItem('carts') ? JSON.parse(localStorage.getItem('carts')!) : [];
  }

  subtotal: number = 0;
  loadTotal(){
    for(let c of this.data){
      console.log(c.product.price)
      console.log(c.quantity)
      this.subtotal += (c.product.price * c.quantity);
    }
  }

}
