import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { FeaturedArtistsComponent } from './featured-artists/featured-artists.component';
import { FeaturedFestivalsComponent } from './featured-festivals/featured-festivals.component';
import { CarruselHomeComponent } from './carrusel-home/carrusel-home.component';


@NgModule({
  declarations: [
    FeaturedArtistsComponent,
    FeaturedFestivalsComponent,
    CarruselHomeComponent
  ],
  imports: [
    CommonModule,
    HomeRoutingModule
  ]
})
export class HomeModule { }
