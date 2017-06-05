package com.sm.repo;

import com.sm.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mahdi on 04/06/2017.
 */

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, String> {

    Utilisateur findByLoginAndPassword(String login, String Password);
}
