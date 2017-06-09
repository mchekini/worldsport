package com.sm.Ressources;

import com.sm.Dto.Equipedto;
import com.sm.Entity.Equipe;
import com.sm.Entity.Joueur;
import com.sm.Mapper.EquipeMapper;
import com.sm.Mapper.JoueurMapper;
import com.sm.Profiles.Env;
import com.sm.Utils.SessionBean;
import com.sm.repo.EquipeRepository;
import com.sm.repo.JoueurRepository;
import javassist.bytecode.stackmap.TypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.BeanParam;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Mahdi on 04/06/2017.
 */

@RestController
public class JoueurRessource {

    JoueurMapper joueurMapper;

    EquipeRepository equipeRepository;

    EquipeMapper equipeMapper;

    JoueurRepository joueurRepository;

    SessionBean sessionBean;

    @Autowired
    Env env;

    private static final Logger LOGGER = Logger.getLogger(TypeData.ClassName.class.getName());

    @Autowired
    private ApplicationContext context;

    @Autowired
    public JoueurRessource(JoueurMapper joueurMapper,
                           EquipeRepository equipeRepository,
                           EquipeMapper equipeMapper,
                           JoueurRepository joueurRepository,
                           SessionBean sessionBean
    ) {

        this.equipeRepository = equipeRepository;
        this.joueurMapper = joueurMapper;
        this.joueurRepository = joueurRepository;
        this.equipeMapper = equipeMapper;
        this.sessionBean = sessionBean;
    }

    @RequestMapping("/joueurs")
    public String getJoueurs() {
        List<Joueur> liste = joueurRepository.findAll();
        return "test";
    }


    @RequestMapping("/")
    public String test() {

        return env.getEnv();
    }


    @RequestMapping("/saveteam")
    public String save(@BeanParam final Equipedto equipe) {

        Equipe eq = equipeMapper.maptoEquipe(equipe);
        equipeRepository.save(eq);
        return "OK";
    }


}
