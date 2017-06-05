import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { Injectable } from '@angular/core';
import { Http, URLSearchParams } from '@angular/http';
import { Team } from 'app/models/Team';





@Injectable()
export class MonService{

    
    constructor(private httpService: Http){

    }


    saveTeam(team:Team)
    {
        this.httpService.get(`http://localhost:8080/saveteam`, {search: team})
            .map(response => response.json())
            .subscribe(
                data => console.log("enregistrement reussi"),
                () =>  alert("sauvegarde effectuée avec succès")
            );
    }




}
