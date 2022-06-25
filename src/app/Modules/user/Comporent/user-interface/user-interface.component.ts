import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartComponent } from '../cart/cart.component';
import { HomeComponent } from '../home/home.component';
import { ProductDetailComponent } from '../product-detail/product-detail.component';
import { StoreComponent } from '../store/store.component';

@Component({
  selector: 'app-user-interface',
  templateUrl: './user-interface.component.html',
  styleUrls: ['./user-interface.component.css']
})
export class UserInterfaceComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.router.routeReuseStrategy.shouldReuseRoute = () => false;
    this.data = localStorage.getItem('carts') ? JSON.parse(localStorage.getItem('carts')!) : [];
    console.log(this.data)
  }

  countPro: number = 0;
  proPrice: number = 0;
  data: any = [];
  addToCart(componentRef:any) {
    if(componentRef instanceof HomeComponent) {
      componentRef.clickBuy.subscribe(() => {
        this.countPro++;
      })
    }
  }

  addToCartFromShop(componentRef:any) {
    if(componentRef instanceof StoreComponent) {
      componentRef.clickBuy.subscribe((productId) => {
        this.data = localStorage.getItem('carts') ? JSON.parse(localStorage.getItem('carts')!) : [];
        for(let c of this.data){
          if(c.product.productId == productId){
            if(c.quantity == 1){
              this.countPro++;
            }
          }
        }
      })
    }
  }

  addToCartFromProDetail(componentRef:any) {
    if(componentRef instanceof ProductDetailComponent) {
      componentRef.clickBuy.subscribe((productId) => {
        this.data = localStorage.getItem('carts') ? JSON.parse(localStorage.getItem('carts')!) : [];
        for(let c of this.data){
          if(c.product.productId == productId){
            if(c.quantity == 1){
              this.countPro++;
            }
          }
        }
      })
    }
  }

  addTotalFromHome(componentRef:any) {
    if(componentRef instanceof HomeComponent) {
      componentRef.clickTotal.subscribe((price) => {
        this.proPrice = this.proPrice + price;
      })
    }
  }

  addTotalFromShop(componentRef:any) {
    if(componentRef instanceof StoreComponent) {
      componentRef.clickTotal.subscribe((price) => {
        this.proPrice = this.proPrice + price
        console.log(this.proPrice);
      })
    }
  }

  addTotalFromProDetail(componentRef:any) {
    if(componentRef instanceof ProductDetailComponent) {
      componentRef.clickTotal.subscribe((price) => {
        this.proPrice = this.proPrice + price
        console.log(this.proPrice);
      })
    }
  }

  countWishList: number = 0;

  addToWishList(componentRef:any) {
    if(componentRef instanceof HomeComponent) {
      componentRef.clickWithlist.subscribe((p) => {
        this.countWishList++;
        console.log(p);
      })
    }
  }

  addToWishListFromShop(componentRef:any) {
    if(componentRef instanceof StoreComponent) {
      componentRef.clickWithlist.subscribe((p) => {
        this.countWishList++;
        console.log(p);
      })
    }
  }

}
