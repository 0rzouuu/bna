package com.example.RecruBna.models;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@Table(name="diplome")
public class diplome
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiplome;

    @Column(name="NomDiplome")
    private String NomDiplome ;

    @Column(name="Fac")
    private String Fac ;

    // poste diplomee
    @ManyToMany(mappedBy = "diplome")
    private List<poste> poste ;
}

