package com.example.RecruBna.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="direction")
public class direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDirection;

    @Column(name = "NbrDirection")
    private int NbrDirection;

    @Column(name = "NomDirection")
    private String NomDirection;


    // Many-to-one relationship with Compagne
    @ManyToOne
    @JoinColumn(name = "idCampagne")
    @JsonBackReference
    private campagne campagne;


    // one to many direction-poste
    @OneToMany(mappedBy = "direction", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<poste> poste =new ArrayList<>();


    // getters setters


}


