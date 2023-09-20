import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GlobalRoutingModule } from './global-routing.module';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
// import { HomeComponent } from 'src/app/shared/views/home/home.component';


@NgModule({
  declarations: [
    LoginComponent,
    RegisterComponent,
    // HomeComponent
  ],
  imports: [
    CommonModule,
    GlobalRoutingModule
  ]
})
export class GlobalModule { }
