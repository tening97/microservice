package com.ecole221.l3devweb.first.service.mapper;

import com.ecole221.l3devweb.common.service.dto.PersonneDto;
import com.ecole221.l3devweb.first.service.entity.Personne;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class PersonneMapper {

    public Personne personneDtoToPersonneEntity(PersonneDto personneDto) throws ParseException {
        return Personne.builder()
                .id(personneDto.getId())
                .nomComplet(personneDto.getNomComplet())
                .dateNaissance(new SimpleDateFormat("dd/MM/yyyy").parse(personneDto.getDateNaissance()))
                .personneStatus(personneDto.getPersonneStatus())
                .build();
    }


    public PersonneDto personneEntityToPersonneDto(Personne personne) throws ParseException {
        return PersonneDto.builder()
                .id(personne.getId())
                .nomComplet(personne.getNomComplet())
                .dateNaissance(new SimpleDateFormat("dd/MM/yyyy").format(personne.getDateNaissance()))
                .personneStatus(personne.getPersonneStatus())
                .build();
    }

}
