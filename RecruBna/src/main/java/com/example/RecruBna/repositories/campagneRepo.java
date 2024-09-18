package com.example.RecruBna.repositories;

import com.example.RecruBna.models.campagne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface campagneRepo extends JpaRepository<campagne, Integer> {
    public campagne findByIdCampagne(int id);
}
