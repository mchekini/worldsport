export class Team{

public id: number;
public pays: string;
public nom :string;


constructor(data:any)
{
    this.id = data.id;
    this.pays = data.pays;
    this.nom = data.nom;
}

}