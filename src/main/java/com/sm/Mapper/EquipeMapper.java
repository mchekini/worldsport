package com.sm.Mapper;

import com.sm.Dto.Equipedto;
import com.sm.Dto.JoueurDTO;
import com.sm.Entity.Equipe;
import com.sm.Entity.Joueur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Created by Mahdi on 04/06/2017.
 */

@Mapper(componentModel = "spring")
public interface EquipeMapper {



    List<JoueurDTO> mapListtojoueurdto(List<Joueur> joueurList);

    @Mapping(target = "equipe", source = "equipe.nom")
    JoueurDTO maptojoueurdto(Joueur joueur);

    Equipedto maptoEquipeDTO(Equipe equipe);

    Equipe maptoEquipe(Equipedto edto);





}
