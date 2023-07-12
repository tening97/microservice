package com.ecole221.l3devweb.common.service.dto;

import com.ecole221.l3devweb.common.service.event.AgeStatus;
import com.ecole221.l3devweb.common.service.event.PersonneStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


public class PersonneDto {

    private UUID id;

    private String nomComplet;

    private String dateNaissance;

    private PersonneStatus personneStatus;

    private AgeStatus ageStatus;

    public PersonneDto(UUID id, String nomComplet, String dateNaissance, PersonneStatus personneStatus , AgeStatus ageStatus) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.dateNaissance = dateNaissance;
        this.personneStatus = personneStatus;
        this.ageStatus = ageStatus;

    }



    public PersonneDto(){}
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public PersonneStatus getPersonneStatus() {
        return personneStatus;
    }

    public void setPersonneStatus(PersonneStatus personneStatus) {
        this.personneStatus = personneStatus;
    }

    public AgeStatus getAgeStatus() {
        return ageStatus;
    }

    public void setAgeStatus(AgeStatus ageStatus) {
        this.ageStatus = ageStatus;
    }
}
