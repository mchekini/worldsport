import {Component} from "@angular/core";
import {AuthentificationService} from "./authentification.service";
import * as moment from "moment";
@Component({
  selector: 'app-root',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent {

private login:string;
private password:string;
private errorMessage : string ;

  private date = 'Mon Jun 05 2017 14:38:42 GMT+0200';


constructor(private auth: AuthentificationService)
{
  this.errorMessage = "";
  console.log(moment().format());
  console.log(moment.utc().format());
  console.log(moment.utc(new Date(this.date)).format());
}


submit(){

    this.auth.Authentifiate(this.login, this.password).subscribe(
        data => {
          if (data.resultat == "OK") document.location.href = "add";
            else this.errorMessage = "Login ou mot de passe incorrect";
        }
    );

}


}
