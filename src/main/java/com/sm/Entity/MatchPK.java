package com.sm.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mahdi on 04/06/2017.
 */

@Embeddable
public class MatchPK implements Serializable {

    @ManyToOne
    @JoinColumn (name = "home_team")
    protected Equipe hometeam;

    @ManyToOne
    @JoinColumn (name = "away_team")
    protected Equipe awayteam;


    protected Date datematch;



}