package com.sm.Entity;

/**
 * Created by Mahdi on 04/06/2017.
 */
public class Score {

    private Integer homegoals;
    private Integer awaygoals;


    public Integer getHomegoals() {
        return homegoals;
    }

    public void setHomegoals(Integer homegoals) {
        this.homegoals = homegoals;
    }

    public Integer getAwaygoals() {
        return awaygoals;
    }

    public void setAwaygoals(Integer awaygoals) {
        this.awaygoals = awaygoals;
    }


    @Override
    public String toString() {
        return this.homegoals + " - " + awaygoals;
    }
}
