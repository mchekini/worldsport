import { Component } from '@angular/core';
import { Team } from 'app/models/Team';
import { FormsModule } from '@angular/forms';
import { MonService } from './teamadd.service';

@Component({
  selector: 'app-root',
  templateUrl: './teamadd.component.html',
  styleUrls: ['./teamadd.component.css']
})
export class TeamAdd {
  
private team: Team;


constructor(private service:MonService)
{
  this.team = new Team({id:'',nom:'',pays:''});
}

submit()
{
  this.service.saveTeam(this.team);
}


}
