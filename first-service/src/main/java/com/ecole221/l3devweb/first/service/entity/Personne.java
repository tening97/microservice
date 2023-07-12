package com.ecole221.l3devweb.first.service.entity;

import com.ecole221.l3devweb.common.service.event.AgeStatus;
import com.ecole221.l3devweb.common.service.event.PersonneStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Personne {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID id;

    private String nomComplet;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;

    private PersonneStatus personneStatus;

    private AgeStatus ageStatus;

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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
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
