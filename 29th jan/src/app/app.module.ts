import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './user/register/register.component';
import { HeroesComponent } from './heroes/heroes.component';
import { HeroDetailComponent } from './hero-detail/hero-detail.component';
import { RedDirective } from './red.directive';
import { HomeComponent } from './service/home/home.component';
import { TestService } from './service/test.service';
import { FormsComponent } from './forms/forms.component';
import { UsersComponent } from './user/users/users.component';
import { HttpClientModule} from '@angular/common/http';
import { UpdateUserComponent } from './user/update-user/update-user.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    HeroesComponent,
    HeroDetailComponent,
    RedDirective,
    HomeComponent,
    FormsComponent,
    UsersComponent,
    UpdateUserComponent,

    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [TestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
