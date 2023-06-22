package com.ecole221.l3devweb.common.service.event;

import com.ecole221.l3devweb.common.service.dto.PersonneAgeDto;

import java.util.Date;
import java.util.UUID;

public class AgeEvent implements  Event{

    private AgeStatus ageStatus;
    private PersonneAgeDto personneAgeDto;

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
}
