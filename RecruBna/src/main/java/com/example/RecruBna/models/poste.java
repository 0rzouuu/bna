package com.example.RecruBna.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="poste")
public class poste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPoste;
    @Column(name = "NbrPoste")
    private int NbrPoste;
    @Column(name = "NomPoste")
    private String NomPoste;


    //direction poste
    @ManyToOne
    @JoinColumn(name = "idDirection")
    @JsonBackReference
    private direction direction;


    // poste diplome
    @ManyToMany
    @JoinTable(
            name = "poste_diplome",
            joinColumns = @JoinColumn(name = "id_poste"),
            inverseJoinColumns = @JoinColumn(name = "id_diplome")
    )
    private List<diplome> diplome; // <-- Ensure this field is named 'diplome'



    //poste candidature
    @OneToMany(mappedBy = "poste", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<candidature> candidature =new ArrayList<>();


   //getters setters


}
