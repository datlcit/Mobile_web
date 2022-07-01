import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountDetailComponent } from './Comporent/account-detail/account-detail.component';
import { CartComponent } from './Comporent/cart/cart.component';
import { CheckoutComponent } from './Comporent/checkout/checkout.component';
import { CongratulationComponent } from './Comporent/congratulation/congratulation.component';
import { FooterComponent } from './Comporent/footer/footer.component';
import { HeaderComponent } from './Comporent/header/header.component';
import { HomeComponent } from './Comporent/home/home.component';
import { LoginComponent } from './Comporent/login/login.component';
import { OrderDetailComponent } from './Comporent/order-detail/order-detail.component';
import { PhoneModelComponent } from './Comporent/phone-model/phone-model.component';
import { ProductDetailComponent } from './Comporent/product-detail/product-detail.component';
import { StoreComponent } from './Comporent/store/store.component';
import { UserInterfaceComponent } from './Comporent/user-interface/user-interface.component';

const routes: Routes = [
  { path: '',
    component: UserInterfaceComponent,
    children: [
      {path: 'home', component: HomeComponent},
      {path: 'header', component: HeaderComponent},
      {path: 'footer', component: FooterComponent},
      {path: 'accountDetail', component: AccountDetailComponent},
      {path: 'cart', component: CartComponent},
      {path: 'checkout', component: CheckoutComponent},
      {path: 'login', component: LoginComponent},
      {path: 'productDetail/:productId', component: ProductDetailComponent},
      {path: 'store', component: StoreComponent},
      {path: 'orderDetail', component: OrderDetailComponent},
      {path: 'congratulation', component: CongratulationComponent},

      {path: 'phoneModel/:phoneName', component: PhoneModelComponent},

      {path: '', redirectTo: '/user/home', pathMatch: 'full'}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule, CommonModule]
})
export class UserRoutingModule { }
