package com.sm.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Mahdi on 04/06/2017.
 */

@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipe")
    private Long id;

    @Column(name = "nom_equipe")
    private String nom;

    @Column(name = "pays_equipe")
    private String pays;

    @OneToMany(mappedBy = "equipe")
    private List<Joueur> joueurList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<Joueur> getJoueurList() {
        return joueurList;
    }

    public void setJoueurList(List<Joueur> joueurList) {
        this.joueurList = joueurList;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", pays='" + pays + '\'' +
                ", joueurList=" + joueurList +
                '}';
    }
}
