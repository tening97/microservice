package com.ecole221.l3devweb.common.service.dto;

import com.ecole221.l3devweb.common.service.event.AgeStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

public class PersonneAgeDto {

    private UUID personneId;

    private long age;

    private AgeStatus ageStatus;

    public UUID getPersonneId() {
        return personneId;
    }

    public void setPersonneId(UUID personneId) {
        this.personneId = personneId;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public AgeStatus getAgeStatus() {
        return ageStatus;
    }

    public void setAgeStatus(AgeStatus ageStatus) {
        this.ageStatus = ageStatus;
    }

    public PersonneAgeDto(UUID personneId, long age) {
        this.personneId = personneId;
        this.age = age;
    }
}
