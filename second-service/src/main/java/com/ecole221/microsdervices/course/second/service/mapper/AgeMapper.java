package com.ecole221.microsdervices.course.second.service.mapper;

import com.ecole221.l3devweb.common.service.dto.PersonneAgeDto;
import com.ecole221.microsdervices.course.second.service.entity.AgeEntity;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class AgeMapper {

    public PersonneAgeDto AgeEntityToAgeDto(AgeEntity ageEntity){
//        return PersonneAgeDageto.builder()
//                .personneId(ageEntity.getPersonneId())
//                .age(ageEntity.getAge())
//                .build();
        return new PersonneAgeDto(ageEntity.getPersonneId() ,ageEntity.getAge());

    }
}
