import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { GroupsRoutingModule } from './modules/groups/groups-routing.module'

import { AppComponent } from './app.component';
import { FooterComponent } from './shared/components/footer/footer.component';
import { HeaderHomeComponent } from './shared/components/header-home/header-home.component';
import { CarruselHomeComponent } from './shared/components/carrusel-home/carrusel-home.component';
import { FeaturesArtistComponent } from './shared/components/features-artist/features-artist.component';
import { FeaturesFestivalsComponent } from './shared/components/features-festivals/features-festivals.component';
import { GlobalRoutingModule } from './modules/global/global-routing.module';
import { HomeComponent } from './shared/views/home/home.component';
// import { GroupsDirective } from './modules/groups/directives/groups.directive';
// import { SonDirective } from './modules/groups/directives/son.directive';







@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderHomeComponent,
    CarruselHomeComponent,
    FeaturesArtistComponent,
    FeaturesFestivalsComponent,
    HomeComponent,
    // GroupsDirective,
    // SonDirective,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    GlobalRoutingModule,
    GroupsRoutingModule,
  ],
  exports: [],

  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
