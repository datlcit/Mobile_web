import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserRoutingModule } from './user-routing.module';
import { FooterComponent } from './Comporent/footer/footer.component';
import { HeaderComponent } from './Comporent/header/header.component';
import { HomeComponent } from './Comporent/home/home.component';
import { UserInterfaceComponent } from './Comporent/user-interface/user-interface.component';
import { AccountDetailComponent } from './Comporent/account-detail/account-detail.component';
import { CartComponent } from './Comporent/cart/cart.component';
import { CheckoutComponent } from './Comporent/checkout/checkout.component';
import { LoginComponent } from './Comporent/login/login.component';
import { ProductDetailComponent } from './Comporent/product-detail/product-detail.component';
import { StoreComponent } from './Comporent/store/store.component';
import { NotFoundComponent } from './Comporent/not-found/not-found.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { OrderDetailComponent } from './Comporent/order-detail/order-detail.component';
import { CongratulationComponent } from './Comporent/congratulation/congratulation.component';


@NgModule({
  declarations: [
    FooterComponent,
    HeaderComponent,
    HomeComponent,
    UserInterfaceComponent,
    AccountDetailComponent,
    CartComponent,
    CheckoutComponent,
    LoginComponent,
    ProductDetailComponent,
    StoreComponent,
    NotFoundComponent,
    OrderDetailComponent,
    CongratulationComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    UserRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class UserModule { }
