import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SharedRoutingModule } from './shared-routing.module';
import { HomeComponent } from './components/home/home.component';
import { HeaderHomeComponent } from './components/header-home/header-home.component';
import { FooterHomeComponent } from './components/footer-home/footer-home.component';
import { CarruselHomeComponent } from './components/carrusel-home/carrusel-home.component';
import { FeaturesArtistComponent } from './components/features-artist/features-artist.component';
import { FeaturesFestivalsComponent } from './components/features-festivals/features-festivals.component';
import { FooterComponent } from './footer/footer.component';


@NgModule({
  declarations: [
    HomeComponent,
    HeaderHomeComponent,
    FooterHomeComponent,
    CarruselHomeComponent,
    FeaturesArtistComponent,
    FeaturesFestivalsComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    SharedRoutingModule
  ]
})
export class SharedModule { }
