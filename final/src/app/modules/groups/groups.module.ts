import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GroupsRoutingModule } from './groups-routing.module';
import { RrssComponent } from './components/rrss/rrss.component';
import { ProfailCardComponent } from './components/profail-card/profail-card.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HeaderComponent } from './components/header/header.component';
import { ProfailGroupsComponent } from './views/profail-groups/profail-groups.component';
import { PlaylistComponent } from './views/playlist/playlist.component';
import { NewMusicComponent } from './components/new-music/new-music.component';
import { VideoclipsComponent } from './components/videoclips/videoclips.component';
import { PlaylistGroupComponent } from './components/playlist-group/playlist-group.component';
import { LoginComponent } from '../global/login/login.component';
import { HomeComponent } from 'src/app/shared/views/home/home.component';
import { FavGroupComponent } from './components/fav-group/fav-group.component';










@NgModule({
  declarations: [
    RrssComponent,
    ProfailCardComponent,
    DashboardComponent,
    HeaderComponent,
    ProfailGroupsComponent,
    PlaylistComponent,
    NewMusicComponent,
    VideoclipsComponent,
    PlaylistGroupComponent,
    LoginComponent,
    FavGroupComponent
    // HomeComponent,
  ],
  imports: [CommonModule, GroupsRoutingModule],

  exports: [],
})
export class GroupsModule {}
