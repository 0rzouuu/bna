package com.example.RecruBna.repositories;
import com.example.RecruBna.models.candidature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface candidatureRepo extends JpaRepository<candidature, Integer> {
    public candidature findByidCandidature(int canid);
    long countBycinCanda(String cinCanda);
}
