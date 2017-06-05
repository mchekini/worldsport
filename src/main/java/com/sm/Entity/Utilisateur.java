package com.sm.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Mahdi on 04/06/2017.
 */

@Entity
public class Utilisateur {

    @Id
    private String login;

    private String password;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
