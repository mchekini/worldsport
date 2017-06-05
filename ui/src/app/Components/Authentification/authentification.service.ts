import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { Injectable } from '@angular/core';
import { Http, URLSearchParams } from '@angular/http';
import { Team } from 'app/models/Team';





@Injectable()
export class AuthentificationService{

    
    constructor(private httpService: Http){

    }


    Authentifiate(login:string,password:string):Observable<any>
    {
       return  this.httpService.get(`http://localhost:8080/authentification`, {search:{login:login,password:password}})
               .map(response => response.json());
            
    }




}
