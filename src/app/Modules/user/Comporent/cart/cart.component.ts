import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { LazyLoadScriptService } from 'src/app/Modules/admin/adminServices/lazy-load-script.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  data: any[] = [];
  constructor(private lazyLoad: LazyLoadScriptService) { }

  ngOnInit(): void {
    this.lazyLoad.loadScript('assets/js/main.js').subscribe(_ => {
    });
    this.loadCart();
    this.loadTotal();
  }

  subtotal: number = 0;
  loadTotal(){
    for(let c of this.data){
      this.subtotal += c.product.price * c.quantity;
    }
    console.log(this.subtotal)
  }

  reloadCurrentPage() {
    window.location.reload();
   }

  loadCart(){
    // Lấy dữ liệu giỏ hàng trong storage
    this.data = localStorage.getItem('carts') ? JSON.parse(localStorage.getItem('carts')!) : [];
    console.log(this.data)
    for(let c of this.data){
      console.log(c.quantity)
    }
  }

  updateCart(){
    localStorage.setItem('carts', JSON.stringify(this.data));
  }

  deleteCart(index: number){
    this.data.splice(index, 1);
    localStorage.setItem('carts', JSON.stringify(this.data));
  }

}
