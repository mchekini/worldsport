package com.sm.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.jmx.export.annotation.ManagedResource;

import javax.persistence.*;

/**
 * Created by Mahdi on 04/06/2017.
 */

@Entity
public class Joueur {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_joueur")
    private Long id;

    @Column(name = "nom_joueur")
    private String nom;

    @Column(name = "prenom_joueur")
    private String prenom;

    @Column(name = "age_joueur")
    private Integer age;

    @Column(name = "numero_joueur")
    private Integer numero;

    @ManyToOne
    @JoinColumn(name = "equipe_joueur")
    private Equipe equipe;

    public Long getId() {
        return id;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Joueur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", equipe=" + equipe +
                '}';
    }
}
