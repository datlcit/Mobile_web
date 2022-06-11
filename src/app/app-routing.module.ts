import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardService } from './Modules/admin/adminServices/auth-guard.service';
import { NotFoundComponent } from './Modules/user/Comporent/not-found/not-found.component';

const routes: Routes = [
  { path: '', loadChildren: () => import('./Modules/user/user.module').then(m => m.UserModule)},
  // { path: 'admin', loadChildren: () => import('./Modules/admin/admin.module').then(m => m.AdminModule), canActivate: [AuthGuardService]},
  { path: 'admin', loadChildren: () => import('./Modules/admin/admin.module').then(m => m.AdminModule)},
  { path: 'user', loadChildren: () => import('./Modules/user/user.module').then(m => m.UserModule)},
  { path: '**', component: NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
