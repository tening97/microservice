package com.ecole221.l3devweb.first.service.entity;

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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private UUID id;

    private String nomComplet;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;

    private PersonneStatus personneStatus;




}
