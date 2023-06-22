package com.ecole221.l3devweb.first.service.repository;

import com.ecole221.l3devweb.first.service.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonneRepository extends JpaRepository<Personne ,UUID > {
}
