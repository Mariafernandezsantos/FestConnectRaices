import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './modules/global/login/login.component';
import { HomeComponent } from './shared/views/home/home.component';
import { RegisterComponent } from './modules/global/register/register.component';






const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'registro', component: RegisterComponent },
  { path: 'home', component: HomeComponent },
  {path: 'groups', loadChildren: () =>import('./modules/groups/groups.module').then((m) => m.GroupsModule),},
];

@NgModule({
  imports: [RouterModule.forRoot(routes) ],


exports: [RouterModule]
})
export class AppRoutingModule {}
