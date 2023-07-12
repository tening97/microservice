package com.ecole221.microsdervices.course.second.service.service;

import com.ecole221.l3devweb.common.service.dto.PersonneAgeDto;
import com.ecole221.l3devweb.common.service.dto.PersonneDto;
import com.ecole221.l3devweb.common.service.event.AgeEvent;
import com.ecole221.l3devweb.common.service.event.AgeStatus;
import com.ecole221.l3devweb.common.service.event.PersonneEvent;
import com.ecole221.microsdervices.course.second.service.entity.AgeEntity;
import com.ecole221.microsdervices.course.second.service.mapper.AgeMapper;
import com.ecole221.microsdervices.course.second.service.repository.AgeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AgeService {
    private final AgeRepository ageRepository;
    private final AgeMapper ageMapper;


    public AgeService(AgeRepository ageRepository, AgeMapper ageMapper) {
        this.ageRepository = ageRepository;
        this.ageMapper = ageMapper;
    }

    @Transactional
    public AgeEvent saveAge(PersonneEvent personneEvent) throws ParseException {
        PersonneDto personneDTO = personneEvent.getPersonneDto();
        long age = Utils.
                getYearsBetweenToDates(Utils.
                        convertToLocalDateViaInstant(new SimpleDateFormat("dd/MM/yyyy")
                                .parse(personneDTO.getDateNaissance())), LocalDate.now());
        AgeEvent ageEvent = null;
        PersonneAgeDto ageDTO = new PersonneAgeDto(personneDTO.getId(), age);
        try {
            AgeEntity ageEntity = new AgeEntity(personneDTO.getId(), age);
            ageRepository.save(ageEntity);
            ageEvent = new AgeEvent(ageDTO, AgeStatus.UPDATED);
        }
        catch(Exception ex){
            ageEvent = new AgeEvent(ageDTO, AgeStatus.ERROR_AGE);
        }
        return ageEvent;
    }

    public List<PersonneAgeDto> findAll(){
        return ageRepository.findAll().
                stream().map(a-> new PersonneAgeDto(
                        a.getPersonneId(), a.getAge()
                )
        ).toList();
    }

    public PersonneAgeDto find(UUID ageId){
        Optional<AgeEntity> ageEntity =  ageRepository.findById(ageId);
        if(ageEntity.isEmpty()){
            return null;
        }
        return ageMapper.AgeEntityToAgeDto(ageEntity.get());
    }
}
