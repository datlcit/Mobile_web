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
      componentRef.clickBuy.subscribe((productId: any) => {
        if(componentRef instanceof ProductDetailComponent) {
              componentRef.clickBuy2.subscribe((color: any) => {
                this.data = localStorage.getItem('carts') ? JSON.parse(localStorage.getItem('carts')!) : [];
                for(let c of this.data){
                  if(c.product.productId == productId && c.product.color == color && c.quantity == 1){

                    this.countPro++;
                    break;
                  }
                }
          })
        }
      })
    }
  }

  // addToCartFromProDetail(componentRef:any) {
  //   if(componentRef instanceof ProductDetailComponent) {
  //     componentRef.clickBuy.subscribe((productId: any) => {
  //       this.data = localStorage.getItem('carts') ? JSON.parse(localStorage.getItem('carts')!) : [];
  //       for(let c of this.data){
  //         if(c.product.productId == productId){
  //           if(c.quantity == 1){
  //             this.countPro++;
  //           }
  //         }
  //       }
  //     })
  //   }
  // }

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
      })
    }
  }

  addTotalFromProDetail(componentRef:any) {
    if(componentRef instanceof ProductDetailComponent) {
      componentRef.clickTotal.subscribe((price) => {
        this.proPrice = this.proPrice + price
      })
    }
  }

  countWishList: number = 0;

  addToWishList(componentRef:any) {
    if(componentRef instanceof HomeComponent) {
      componentRef.clickWithlist.subscribe((p) => {
        this.countWishList++;
      })
    }
  }

  addToWishListFromShop(componentRef:any) {
    if(componentRef instanceof StoreComponent) {
      componentRef.clickWithlist.subscribe((p) => {
        this.countWishList++;
      })
    }
  }

}
