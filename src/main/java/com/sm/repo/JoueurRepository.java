package com.sm.repo;

import com.sm.Entity.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mahdi on 04/06/2017.
 */
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
}
