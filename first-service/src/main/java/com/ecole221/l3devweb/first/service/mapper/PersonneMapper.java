package com.ecole221.l3devweb.first.service.mapper;

import com.ecole221.l3devweb.common.service.dto.PersonneDto;
import com.ecole221.l3devweb.first.service.entity.Personne;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class PersonneMapper {

    public Personne personneDtoToPersonneEntity(PersonneDto personneDto) throws ParseException {
//        return Personne.builder()
//                .id(personneDto.getId())
//                .nomComplet(personneDto.getNomComplet())
//                .dateNaissance(new SimpleDateFormat("dd/MM/yyyy").parse(personneDto.getDateNaissance()))
//                .personneStatus(personneDto.getPersonneStatus())
//                .build();
        Personne personne = new Personne();
        personne.setAgeStatus(personneDto.getAgeStatus());
        personne.setNomComplet(personneDto.getNomComplet());
        personne.setDateNaissance(new SimpleDateFormat("yyyy-MM-dd").parse(personneDto.getDateNaissance()));
        personne.setPersonneStatus(personneDto.getPersonneStatus());
        return personne;
    }


    public PersonneDto personneEntityToPersonneDto(Personne personne) throws ParseException {
        PersonneDto personneDto = new PersonneDto();
        personneDto.setPersonneStatus(personne.getPersonneStatus());
        personneDto.setDateNaissance(new SimpleDateFormat("dd/MM/yyyy").format(personne.getDateNaissance()));
        personneDto.setNomComplet(personne.getNomComplet());
        personneDto.setId(personne.getId());

//        return PersonneDto.builder()
//                .id(personne.getId())
//                .nomComplet(personne.getNomComplet())
//                .dateNaissance(new SimpleDateFormat("dd/MM/yyyy").format(personne.getDateNaissance()))
//                .personneStatus(personne.getPersonneStatus())
//                .build();
        return personneDto;
    }

}
