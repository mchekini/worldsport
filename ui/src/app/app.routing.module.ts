import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { AuthentificationComponent } from './Components/Authentification/authentification.component';
import { TeamAdd } from './Components/TeamAdd/teamadd.component';


@NgModule({
    imports: [
        RouterModule.forRoot([
            {path: '', component: AuthentificationComponent},
            {path: 'add', component: TeamAdd},

        ])
    ],
    exports: [
        RouterModule
    ]
})
export class AppRoutingModule {
}
