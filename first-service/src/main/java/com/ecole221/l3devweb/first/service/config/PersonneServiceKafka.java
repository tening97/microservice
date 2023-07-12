package com.ecole221.l3devweb.first.service.config;

import com.ecole221.l3devweb.common.service.event.AgeEvent;
import com.ecole221.l3devweb.first.service.service.PersonneService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PersonneServiceKafka {
    private final PersonneService personneService;

    public PersonneServiceKafka(PersonneService personneService) {
        this.personneService = personneService;
    }


    @KafkaListener(topics = "age-event-topic", groupId = "default", containerFactory
            = "AgeEventListner")
    public void getResponse(AgeEvent ageEvent) throws JsonProcessingException {

        personneService.updatePersonne(ageEvent);

    }
}
