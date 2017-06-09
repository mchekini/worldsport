package com.sm.Ressources;

import com.sm.Dto.JoueurDTO;
import com.sm.Mapper.JoueurMapper;
import com.sm.repo.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mahdi on 05/06/2017.
 */

@RestController
public class TeamDetailsRessource {

    @Autowired
    EquipeRepository equipeRepository;

    @Autowired
    JoueurMapper joueurMapper;

    @RequestMapping("/listTeams")
    public List<String> getTeams() {
        return equipeRepository.getAllTeamName();
    }

    @RequestMapping("/teamPlayers")
    public List<JoueurDTO> findPlayersByTeam(@PathParam("teamName") String teamName) {

        return equipeRepository.getPlayersByTeam(teamName)
                .stream()
                .map(j -> joueurMapper.maptojoueurdto(j))
                .collect(Collectors.toList());
    }


}
