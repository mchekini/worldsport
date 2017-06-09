package com.sm.Ressources;

import com.sm.Dto.ResultDto;
import com.sm.Entity.Utilisateur;
import com.sm.Utils.Security;
import com.sm.Utils.SessionBean;
import com.sm.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Produces;
import java.security.NoSuchAlgorithmException;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Created by Mahdi on 04/06/2017.
 */

@RestController
public class UserRessource {

    @Autowired
    UserRepository userRepository;

    @Autowired
    Security security;

    @Autowired
    ResultDto resultDto;

    @Autowired
    SessionBean sessionBean;



    @RequestMapping("/authentification")
    @Produces(APPLICATION_JSON)
    public ResultDto authentification(@BeanParam Utilisateur utilisateur) throws NoSuchAlgorithmException {

        String hash = Security.hashMD5(utilisateur.getPassword());
        Utilisateur utilisateur1 = userRepository.findByLoginAndPassword(utilisateur.getLogin(), hash);
        if (utilisateur1 != null) {
            resultDto.setResultat("OK");
            sessionBean.setConnected(true);
        }
        else resultDto.setResultat("KO");
        return resultDto;
    }
}
