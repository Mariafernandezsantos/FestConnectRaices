import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './components/header/header.component';
import { ProfailCardComponent } from './components/profail-card/profail-card.component';
import { RrssComponent } from './components/rrss/rrss.component';

import { ProfailGroupsComponent } from '../groups/views/profail-groups/profail-groups.component';
import { NewMusicComponent } from './components/new-music/new-music.component';
import { PlaylistGroupComponent } from './components/playlist-group/playlist-group.component';
import { VideoclipsComponent } from './components/videoclips/videoclips.component';
import { HomeComponent } from 'src/app/shared/views/home/home.component';
import { FavGroupComponent } from './components/fav-group/fav-group.component';



const routes: Routes = [
  { path: 'header', component: HeaderComponent },
  { path: 'cards', component: ProfailCardComponent },
  { path: 'rrss', component: RrssComponent },
  { path: 'groups', component: ProfailGroupsComponent },
  { path: 'playlist', component: PlaylistGroupComponent },
  { path: 'new', component: NewMusicComponent },
  { path: 'videos', component: VideoclipsComponent },
  { path: 'home', component: HomeComponent },
  { path: 'fav', component: FavGroupComponent },
];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GroupsRoutingModule { }
