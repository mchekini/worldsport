package com.sm.Mapper;

import com.sm.Dto.JoueurDTO;
import com.sm.Entity.Joueur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Created by Mahdi on 04/06/2017.
 */


@Mapper(componentModel = "spring")
public interface JoueurMapper {

    @Mapping(target = "equipe", source = "equipe.nom")
    JoueurDTO maptojoueurdto(Joueur joueur);

}
