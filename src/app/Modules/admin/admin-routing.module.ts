import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardService } from './adminServices/auth-guard.service';
import { AddCategoryComponent } from './Comporent/add-category/add-category.component';
import { AddCustomerComponent } from './Comporent/add-customer/add-customer.component';
import { AddProductComponent } from './Comporent/add-product/add-product.component';
import { AddPromotionComponent } from './Comporent/add-promotion/add-promotion.component';
import { AdminInterfaceComponent } from './Comporent/admin-interface/admin-interface.component';
import { EditCategoryComponent } from './Comporent/edit-category/edit-category.component';
import { EditCustomerComponent } from './Comporent/edit-customer/edit-customer.component';
import { EditProductComponent } from './Comporent/edit-product/edit-product.component';
import { EditPromotionComponent } from './Comporent/edit-promotion/edit-promotion.component';
import { HomeComponent } from './Comporent/home/home.component';
import { ListCategoriesComponent } from './Comporent/list-categories/list-categories.component';
import { ListCustomersComponent } from './Comporent/list-customers/list-customers.component';
import { ListOrderDetailsComponent } from './Comporent/list-order-details/list-order-details.component';
import { ListOrdersComponent } from './Comporent/list-orders/list-orders.component';
import { ListProductsComponent } from './Comporent/list-products/list-products.component';
import { ListPromotionsComponent } from './Comporent/list-promotions/list-promotions.component';
import { ListUsersComponent } from './Comporent/list-users/list-users.component';

const routes: Routes = [
  { path: '', component: AdminInterfaceComponent,
    children: [
      {path: 'addCategory', component: AddCategoryComponent},
      {path: 'addCustomer', component: AddCustomerComponent},
      {path: 'addProduct', component: AddProductComponent},
      {path: 'addPromotion', component: AddPromotionComponent},

      {path: 'editCategory/:categoryId', component: EditCategoryComponent},
      {path: 'editCustomer/:customerId', component: EditCustomerComponent},
      {path: 'editProduct/:productId', component: EditProductComponent},
      {path: 'editPromotion/:promotionId', component: EditPromotionComponent},

      {path: 'home', component: HomeComponent},

      {path: 'listCategories', component: ListCategoriesComponent},
      {path: 'listCustomers', component: ListCustomersComponent},
      {path: 'listOrders', component: ListOrdersComponent},
      {path: 'listProducts', component: ListProductsComponent},
      {path: 'listPromotions', component: ListPromotionsComponent},
      {path: 'listUsers', component: ListUsersComponent},
      {path: 'listOrderDetails', component: ListOrderDetailsComponent},


      {path: '', redirectTo: '/admin/home', pathMatch: 'full'}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
