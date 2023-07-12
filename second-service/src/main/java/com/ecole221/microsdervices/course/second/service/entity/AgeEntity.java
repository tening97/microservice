package com.ecole221.microsdervices.course.second.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
public class AgeEntity {
    @Id
    private UUID personneId;
    private long age;


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

    public AgeEntity(UUID personneId, long age) {
        this.personneId = personneId;
        this.age = age;
    }

    public AgeEntity(){}
}
