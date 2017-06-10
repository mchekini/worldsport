package com.sm.repo;

import com.sm.Entity.Equipe;
import com.sm.Entity.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Mahdi on 04/06/2017.
 */
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

    @Query("select nom from Equipe")
    List<String> getAllTeamName();

    @Query("select eq.joueurList from Equipe eq where eq.nom = :teamName")
    List<Joueur> getPlayersByTeam(@Param("teamName") String teamName);

    List<Equipe> findByPays(String pays);



}
