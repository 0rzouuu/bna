package com.example.RecruBna.repositories;

import com.example.RecruBna.models.direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface directionRepo extends JpaRepository<direction, Integer> {
    public direction findByidDirection(int id);
}
