import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UsersComponent } from './login/users/users.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { UpdateUserComponent } from './login/update-user/update-user.component';
import { ImportdataComponent } from './adminhome/importdata/importdata.component';
import { CompanydetailsComponent } from './adminhome/companydetails.com/companydetails.com.component';
import { HomeComponent } from './home/home.component';
import { AddcompanyComponent } from './adminhome/companydetails.com/addcompany/addcompany.component';
import { CompanyComponent } from './adminhome/company/company.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { ComparecompanyComponent } from './userhome/comparecompany/comparecompany.component';
import { UpdatecompanyComponent } from './adminhome/companydetails.com/updatecompany/updatecompany.component';
import { StockexchangeComponent } from './adminhome/stockexchange/stockexchange.component';
import { AddStockExchangeComponent } from './adminhome/stockexchange/add-stock-exchange/add-stock-exchange.component';
import { IpoComponent } from './adminhome/ipo/ipo.component';
import { ComparesectorComponent } from './userhome/comparesector/comparesector.component';
import { UseripoComponent } from './userhome/useripo/useripo.component';
import { StockexchangetableComponent } from './adminhome/stockexchangetable/stockexchangetable.component';
import { IpolistComponent } from './adminhome/ipo/ipolist/ipolist.component';
import { UpdateipoComponent } from './adminhome/ipo/updateipo/updateipo.component';
import { ActivateComponent } from './activate/activate.component';
import { SectorComponent } from './adminhome/sector/sector.component';
import { AddsectorComponent } from './adminhome/sector/addsector/addsector.component';
import { UpdatesectorComponent } from './adminhome/sector/updatesector/updatesector.component';
import { ChartsComponent } from './charts/charts.component';
import { UsercompanyComponent } from './userhome/usercompany/usercompany.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AdminUserComponent } from './admin-user/admin-user.component';
import { LogoutComponent } from './logout/logout.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent},
  { path: 'admin-user', component: AdminUserComponent },
  { path: 'users', component:UsersComponent},
  { path: 'register', component: RegisterComponent},
  { path: 'adminhome', component:AdminhomeComponent},
  { path: 'update-user', component:UpdateUserComponent},
  { path: 'importData', component:ImportdataComponent},
  { path: 'companydetails', component:CompanydetailsComponent},
  { path: 'Addcompany', component:AddcompanyComponent},
  { path: 'updatecompany', component:UpdatecompanyComponent},
  { path: 'companyList', component:CompanyComponent},
  { path: 'stockexchange' ,component:StockexchangeComponent},
  { path: 'AddStock' , component:AddStockExchangeComponent},
  { path: 'updateStock', component:StockexchangetableComponent},
  { path: 'ipo', component:IpoComponent},
  { path: 'ipolist', component:IpolistComponent},
  { path: 'update-ipo', component:UpdateipoComponent},
  { path: 'sectorList', component:SectorComponent},
  { path: 'add-sector', component:AddsectorComponent},
  { path: 'update-sector', component:UpdatesectorComponent},
  { path: 'userhome', component:UserhomeComponent},
  { path: 'comparecompany', component:ComparecompanyComponent},
  { path: 'comparesector', component:ComparesectorComponent},
  { path: 'userCompany', component:UsercompanyComponent},
  { path: 'userIPO', component:UseripoComponent},
  { path: 'activate', component:ActivateComponent},
  { path: 'charts', component:ChartsComponent},
  { path: 'contactUs', component:ContactUsComponent},
  { path: '**', component: HomeComponent},
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
