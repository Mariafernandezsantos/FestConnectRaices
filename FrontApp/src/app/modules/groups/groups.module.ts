import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GroupsRoutingModule } from './groups-routing.module';
import { RrssComponent } from './components/rrss/rrss.component';
import { ProfailCardComponent } from './components/profail-card/profail-card.component';
import { TracksComponent } from './components/tracks/tracks.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HeaderComponent } from './components/header/header.component';
import { ProfailGroupsComponent } from './views/profail-groups/profail-groups.component';
import { PlaylistComponent } from './views/playlist/playlist.component';

@NgModule({
  declarations: [
    RrssComponent,
    ProfailCardComponent,
    TracksComponent,
    DashboardComponent,
    HeaderComponent,
    ProfailGroupsComponent,
    PlaylistComponent
  ],
  imports: [
    CommonModule,
    GroupsRoutingModule
  ],

  exports: [
    ProfailGroupsComponent
  ]
})
export class GroupsModule {}
