package com.sm.Entity;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mahdi on 04/06/2017.
 */


@Entity
public class Match implements Serializable{
    @Id
    @Embedded
    private MatchPK matchPK ;

    private String score;

    public MatchPK getMatchPK() {
        return matchPK;
    }

    public void setMatchPK(MatchPK matchPK) {
        this.matchPK = matchPK;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
