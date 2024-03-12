import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { LandingComponent } from './landing/landing.component';
import { RegisterComponent } from './register/register.component';
import { ForgotComponent } from './forgot/forgot.component';
// import { DashboardComponent } from './dashboard/dashboard.component';
// import { LogoutComponent } from './logout/logout.component';
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
// {
//   path:'dashboard',
//   component:DashboardComponent
// },
// {
//   path:'logout',
//   component:LogoutComponent,
// },
{
  path: '',   redirectTo: '/landing', pathMatch: 'full'
}
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
 