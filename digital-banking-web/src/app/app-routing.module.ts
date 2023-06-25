import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CustomersComponent} from "./customers/customers.component";
import {AccountsComponent} from "./accounts/accounts.component";
import {NewCustomerComponent} from "./new-customer/new-customer.component";
import {CustomerAccountsComponent} from "./customer-accounts/customer-accounts.component";
import {HomeComponent} from "./home/home.component";
import {LoginComponent} from "./login/login.component";
import {AdminTemplateComponent} from "./admin-template/admin-template.component";
import {AuthenticationGuard} from "./guards/authentication.guard";
import {AccueilComponent} from "./accueil/accueil.component";
import {EditCustomerComponent} from "./edit-customer/edit-customer.component";

const routes: Routes = [
  { path: "",component: AccueilComponent},
 
  { path: "admin",component: AdminTemplateComponent, canActivate : [AuthenticationGuard],
    children:[
      { path :"customers", component : CustomersComponent},
      { path :"new-customer", component : NewCustomerComponent},
      
      { path :"accounts", component : AccountsComponent},
      { path :"customer-accounts/:id", component : CustomerAccountsComponent},
     
    ]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
