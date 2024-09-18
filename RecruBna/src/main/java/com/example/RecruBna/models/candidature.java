package com.example.RecruBna.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Entity
@Data
@ToString
@Table(name="candidature")
public class candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCandidature;

    @Column(name="AnciennetéProfessionnelle")
    private int AnciennetéProfessionnelle;

    @Column(name="MoyenneGenBac")
    private float MoyenneGenBac;

    @Column(name="MoyenneGenDiplome")
    private float MoyenneGenDiplome;

    @Column(name="cinCanda")
    private String cinCanda;

    @Column(name="DiplomeCanda")
    private String DiplomeCanda;

    @Column(name="EmailCanda")
    private String EmailCanda;

    @Column(name="NomCanda")
    private String NomCanda;

    @Column(name="PrenomCanda")
    private String PrenomCanda;

    @Column(name="TelCanda")
    private String TelCanda;

    @Column (name="DateNaissCanda")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DateNaissCanda;

    @Column (name="DateDiplomeCanda")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DateDiplomeCanda;


    //poste candidature
    @ManyToOne
    @JoinColumn(name = "idPoste")
    @JsonBackReference
    private poste poste;

    //candidature candidat
    @OneToOne
    @JoinColumn(name="CinCanda", referencedColumnName = "cinCandidat", insertable = false, updatable = false)
    private candidat candidat;

    //getters setters

}


