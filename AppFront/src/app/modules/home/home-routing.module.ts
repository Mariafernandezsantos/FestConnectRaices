import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FeaturedArtistsComponent } from './featured-artists/featured-artists.component';
import { FeaturedFestivalsComponent } from './featured-festivals/featured-festivals.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
  { path: 'featured-artists', component: FeaturedArtistsComponent },
  { path: 'featured-festivals', component: FeaturedFestivalsComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
