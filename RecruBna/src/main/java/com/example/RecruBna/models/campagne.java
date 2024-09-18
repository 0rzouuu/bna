package com.example.RecruBna.models;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="campagne")
public class campagne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCampagne;

    @Column(name="date_debut")
    @DateTimeFormat
    private Date date_debut;

    @Column(name="date_fin")
    @DateTimeFormat
    private Date date_fin;

    @Column(name="nomLot")
    private String NomLot;

    // One-to-many relationship with Direction
    @OneToMany(mappedBy = "campagne", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<direction> directions =new ArrayList<>();


//getters setters


}

