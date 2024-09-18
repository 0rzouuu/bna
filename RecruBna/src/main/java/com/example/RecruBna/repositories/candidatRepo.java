package com.example.RecruBna.repositories;
import com.example.RecruBna.models.candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface candidatRepo extends JpaRepository<candidat, Integer> {
    public candidat findByidCandidat(int id);
    long countBycinCandidat(String cin);
}
