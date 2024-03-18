import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { LandingComponent } from './landing/landing.component';
import { RegisterComponent } from './register/register.component';
import { ForgotComponent } from './forgot/forgot.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LogoutComponent } from './logout/logout.component';
import { OfferComponent } from './offer/offer.component';
import { SupportComponent } from './support/support.component';
import { CartComponent } from './cart/cart.component';
import { MenuComponent } from './menu/menu.component';
import { ItemComponent } from './item/item.component';
import { CategoryComponent } from './category/category.component';
import { StartersComponent } from './starters/starters.component';
import { MainCourseComponent } from './main-course/main-course.component';
import { DessertsComponent } from './desserts/desserts.component';
import { BeveragesComponent } from './beverages/beverages.component';
const routes: Routes = [
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'',
    component:LandingComponent
  },
  {
    path:'register',
    component:RegisterComponent
  },
  {
    path:'forgot',
    component:ForgotComponent
},
{
  path:'logout',
  component:LogoutComponent,
},
{
  path: '',   
  redirectTo: '/landing', 
  pathMatch: 'full'
},
{
  path:'support',
  component:SupportComponent
},
{
  path:'dashboard',
  component:DashboardComponent
},
{
  path:'offer',
  component:OfferComponent
},
{
  path: 'starters',
  component:StartersComponent
},
{
  path: 'main-course',
  component: MainCourseComponent
},
{
  path:'desserts',
  component:DessertsComponent,
},
{
  path:'beverages',
  component:BeveragesComponent,
}
// {path:'cart', component:CartComponent},
// {path:'menu', component:MenuComponent},
// {path:'item', component:ItemComponent},
// {path:'category', component: CategoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
