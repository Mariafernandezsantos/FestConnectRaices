import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProfailRoutingModule } from './profail-routing.module';
import { HeaderProfailComponent } from './header-profail/header-profail.component';


@NgModule({
  declarations: [
    HeaderProfailComponent
  ],
  imports: [
    CommonModule,
    ProfailRoutingModule
  ]
})
export class ProfailModule { }
