package com.example.RecruBna.repositories;

import com.example.RecruBna.models.poste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface posteRepo extends JpaRepository<poste, Integer> {
    public poste findByidPoste(int id);
}
