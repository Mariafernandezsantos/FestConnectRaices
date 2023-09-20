import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './components/header/header.component';
import { ProfailCardComponent } from './components/profail-card/profail-card.component';
import { RrssComponent } from './components/rrss/rrss.component';
import { TracksComponent } from './components/tracks/tracks.component';
import { ProfailGroupsComponent } from '../groups/views/profail-groups/profail-groups.component';


const routes: Routes = [
  { path: 'header', component: HeaderComponent },
  { path: 'cards', component: ProfailCardComponent },
  { path: 'rrss', component: RrssComponent },
  { path: 'pistas', component: TracksComponent },
  { path: 'groups', component: ProfailGroupsComponent },
];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GroupsRoutingModule { }
