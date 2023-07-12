package com.ecole221.l3devweb.common.service.event;

import com.ecole221.l3devweb.common.service.dto.PersonneDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;


public class PersonneEvent implements Event {

    private PersonneDto personneDto;

    private PersonneStatus personneStatus;

    private UUID eventId = UUID.randomUUID();

    private Date eventDate = new Date();

    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public Date getEventDate() {
        return eventDate;
    }

    public PersonneEvent(PersonneDto personneDto, PersonneStatus personneStatus) {
        this.personneDto = personneDto;
        this.personneStatus = personneStatus;

    }
    public PersonneEvent(PersonneDto personneDto, PersonneStatus personneStatus, UUID eventId, Date eventDate) {
        this.personneDto = personneDto;
        this.personneStatus = personneStatus;
        this.eventId = eventId;
        this.eventDate = eventDate;
    }

    public PersonneEvent(){}

    public PersonneDto getPersonneDto() {
        return personneDto;
    }

    public void setPersonneDto(PersonneDto personneDto) {
        this.personneDto = personneDto;
    }

    public PersonneStatus getPersonneStatus() {
        return personneStatus;
    }

    public void setPersonneStatus(PersonneStatus personneStatus) {
        this.personneStatus = personneStatus;
    }
}
