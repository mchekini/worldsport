package com.sm.Dto;

import org.springframework.stereotype.Component;

/**
 * Created by Mahdi on 05/06/2017.
 */

@Component
public class ResultDto {

    private String resultat;

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }
}
