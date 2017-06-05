import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AuthentificationService } from './authentification.service';

@Component({
  selector: 'app-root',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent {
  
private login:string;
private password:string;
private errorMessage : string ;


constructor(private auth: AuthentificationService)
{
  this.errorMessage = "";
}


submit(){

    this.auth.Authentifiate(this.login, this.password).subscribe(
        data => {
            if (data.resultat == "OK") document.location.href="add"; 
            else this.errorMessage = "Login ou mot de passe incorrect";
        }
    );

}


}
