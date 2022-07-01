import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { SidebarComponent } from './Comporent/sidebar/sidebar.component';
import { AdminInterfaceComponent } from './Comporent/admin-interface/admin-interface.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddCategoryComponent } from './Comporent/add-category/add-category.component';
import { AddCustomerComponent } from './Comporent/add-customer/add-customer.component';
import { AddProductComponent } from './Comporent/add-product/add-product.component';
import { AddPromotionComponent } from './Comporent/add-promotion/add-promotion.component';
import { EditCategoryComponent } from './Comporent/edit-category/edit-category.component';
import { EditCustomerComponent } from './Comporent/edit-customer/edit-customer.component';
import { EditProductComponent } from './Comporent/edit-product/edit-product.component';
import { EditPromotionComponent } from './Comporent/edit-promotion/edit-promotion.component';
import { HomeComponent } from './Comporent/home/home.component';
import { ListCategoriesComponent } from './Comporent/list-categories/list-categories.component';
import { ListCustomersComponent } from './Comporent/list-customers/list-customers.component';
import { ListOrdersComponent } from './Comporent/list-orders/list-orders.component';
import { ListProductsComponent } from './Comporent/list-products/list-products.component';
import { ListPromotionsComponent } from './Comporent/list-promotions/list-promotions.component';
import { HttpClientModule } from '@angular/common/http';
import { ListUsersComponent } from './Comporent/list-users/list-users.component';
import { RouterModule } from '@angular/router';
import { ListOrderDetailsComponent } from './Comporent/list-order-details/list-order-details.component';


@NgModule({
  declarations: [
    SidebarComponent,
    AdminInterfaceComponent,
    AddCategoryComponent,
    AddCustomerComponent,
    AddProductComponent,
    AddPromotionComponent,
    EditCategoryComponent,
    EditCustomerComponent,
    EditProductComponent,
    EditPromotionComponent,
    HomeComponent,
    ListCategoriesComponent,
    ListCustomersComponent,
    ListOrdersComponent,
    ListProductsComponent,
    ListPromotionsComponent,
    ListUsersComponent,
    ListOrderDetailsComponent
  ],
  imports: [
    CommonModule,
    AdminRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class AdminModule { }
