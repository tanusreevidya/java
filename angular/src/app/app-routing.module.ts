import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './user/register/register.component';
import { HomeComponent } from './service/home/home.component';
//import { User } from './models/user';
import { UsersComponent } from './user/users/users.component';


const routes: Routes = [
  { path:'register', component: RegisterComponent},
  { path:'service', component: HomeComponent},
  { path: 'users', component:UsersComponent},
  //{path : 'registeruser', component : RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
