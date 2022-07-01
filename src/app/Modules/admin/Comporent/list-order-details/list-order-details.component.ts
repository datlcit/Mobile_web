import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OrderAdminService } from '../../adminServices/order-admin.service';
import { OrderDetailAdminService } from '../../adminServices/order-detail-admin.service';

@Component({
  selector: 'app-list-order-details',
  templateUrl: './list-order-details.component.html',
  styleUrls: ['./list-order-details.component.css']
})
export class ListOrderDetailsComponent implements OnInit {

  constructor(private orderService: OrderAdminService ,private orderDetailService: OrderDetailAdminService, private router: ActivatedRoute) { }

  ngOnInit(): void {
    this.loadOrders();
  }

  listOrderDetails: Array<any> = [];
  total: number = 0;
  loadOrders(){
    this.orderDetailService.get().subscribe(res => {

      for(let od of res){
        if(od.order.orderId == this.router.snapshot.params['orderId']){
          this.listOrderDetails.push(od);
        }
      }

      // this.listOrderDetails = res;
      console.log(this.listOrderDetails)
      for(let od of this.listOrderDetails){
        this.total += od.price*od.quantity;
      }
      this.total += 50000;
    })
  }
}
