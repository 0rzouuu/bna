package com.example.RecruBna.repositories;

import com.example.RecruBna.models.diplome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface diplomeRepo extends JpaRepository<diplome, Integer> {
    public diplome findByIdDiplome(int id);
}
