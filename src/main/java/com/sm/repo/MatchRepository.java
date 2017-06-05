package com.sm.repo;

import com.sm.Entity.Match;
import com.sm.Entity.MatchPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mahdi on 04/06/2017.
 */
public interface MatchRepository extends JpaRepository<Match, MatchPK> {
}
