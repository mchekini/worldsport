import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule, Http } from '@angular/http';
import { MonService } from './Components/TeamAdd/teamadd.service';
import { AppRoutingModule } from './app.routing.module';
import { AuthentificationComponent } from './Components/Authentification/authentification.component';
import { TeamAdd } from './Components/TeamAdd/teamadd.component';
import { AuthentificationService } from './Components/Authentification/authentification.service';


import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,AuthentificationComponent,TeamAdd
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [MonService, AuthentificationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
