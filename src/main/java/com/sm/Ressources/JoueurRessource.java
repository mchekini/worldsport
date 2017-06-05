package com.sm.Ressources;

import com.sm.Dto.Equipedto;
import com.sm.Dto.JoueurDTO;
import com.sm.Entity.Equipe;
import com.sm.Entity.Joueur;
import com.sm.Mapper.EquipeMapper;
import com.sm.Mapper.JoueurMapper;
import com.sm.repo.EquipeRepository;
import com.sm.repo.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.BeanParam;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Mahdi on 04/06/2017.
 */

@RestController
public class JoueurRessource {

    JoueurMapper joueurMapper;

    EquipeRepository equipeRepository;

    EquipeMapper equipeMapper;

    JoueurRepository joueurRepository;

    @Autowired
    public JoueurRessource(JoueurMapper joueurMapper,
                           EquipeRepository equipeRepository,
                           EquipeMapper equipeMapper,
                           JoueurRepository joueurRepository
    ) {

        this.equipeRepository = equipeRepository;
        this.joueurMapper = joueurMapper;
        this.joueurRepository = joueurRepository;
        this.equipeMapper = equipeMapper;
    }

    @RequestMapping("/joueurs")
    public String getJoueurs() {
        List<Joueur> liste = joueurRepository.findAll();
        return "test";
    }


    @RequestMapping("/")
    public List<JoueurDTO> test() {

        List<Joueur> joueurList = joueurRepository.findAll();

        return joueurList.stream()
                .map(j -> joueurMapper.maptojoueurdto(j))
                .collect(Collectors.toList());
    }



    @RequestMapping("/saveteam")
    public String save(@BeanParam final Equipedto equipe) {

        Equipe eq = equipeMapper.maptoEquipe(equipe);
        equipeRepository.save(eq);
        return "OK";
    }


}
