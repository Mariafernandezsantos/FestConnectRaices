import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GroupsRoutingModule } from './groups-routing.module';
import { ProfailGroupComponent } from './components/profail-group/profail-group.component';
import { RrssComponent } from './components/rrss/rrss.component';
import { ProfailCardComponent } from './components/profail-card/profail-card.component';
import { TracksComponent } from './components/tracks/tracks.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HeaderComponent } from './components/header/header.component';


@NgModule({
  declarations: [
    ProfailGroupComponent,
    RrssComponent,
    ProfailCardComponent,
    TracksComponent,
    DashboardComponent,
    HeaderComponent
  ],
  imports: [
    CommonModule,
    GroupsRoutingModule
  ]
})
export class GroupsModule { }
