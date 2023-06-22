package com.ecole221.l3devweb.first.service.service;

import com.ecole221.l3devweb.common.service.dto.PersonneDto;
import com.ecole221.l3devweb.common.service.event.PersonneStatus;
import com.ecole221.l3devweb.first.service.entity.Personne;
import com.ecole221.l3devweb.first.service.mapper.PersonneMapper;
import com.ecole221.l3devweb.first.service.repository.PersonneRepository;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class PersonneService {

    private final PersonneRepository personneRepository;

    private final PersonneMapper personneMapper;


    public PersonneService(PersonneRepository personneRepository, PersonneMapper personneMapper) {
        this.personneRepository = personneRepository;
        this.personneMapper = personneMapper;
    }

    public Personne save(PersonneDto personneDto) throws ParseException {
        personneDto.setPersonneStatus(PersonneStatus.CREATED);

      return   personneRepository.save(personneMapper.personneDtoToPersonneEntity(personneDto));
    }

    public List<PersonneDto> allPersonnes(){

        return  personneRepository.findAll().stream()
                .map(personne -> new PersonneDto(personne.getId(),personne.getNomComplet(),
                       new SimpleDateFormat("dd/MM/yyyy").format(personne.getDateNaissance()),
                        personne.getPersonneStatus()))
                .toList();
    }
}
