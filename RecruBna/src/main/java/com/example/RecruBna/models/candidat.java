package com.example.RecruBna.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="candidat")
public class candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCandidat;

    @Column(name="NomCandidat")
    private String NomCandidat;

    @Column(name="PrenomCandidat")
    private String PrenomCandidat;

    @Column(name="cinCandidat", unique = true)
    private String cinCandidat;

    // candidature candidat
    @OneToOne(mappedBy = "candidat")
    private candidature candidature;

  //getters setters
}

