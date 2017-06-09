import {NgModule} from "@angular/core";
import {RouterModule} from "@angular/router";
import {AuthentificationComponent} from "./Components/Authentification/authentification.component";
import {TeamAdd} from "./Components/TeamAdd/teamadd.component";
import {TeamDetailsComponent} from "./Components/TeamDetails/teamDetails.component";


@NgModule({
    imports: [
        RouterModule.forRoot([
            {path: '', component: AuthentificationComponent},
            {path: 'add', component: TeamAdd},
          {path: 'teamdetails', component: TeamDetailsComponent}

        ])
    ],
    exports: [
        RouterModule
    ]
})
export class AppRoutingModule {
}
