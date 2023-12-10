package ma.emsi.springrest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.springrest.enums.Genre;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "nom_etudiant", nullable = false)
    String nom;
    @Column(name = "prenom_etudiant")
    String prenom;
    @Enumerated(EnumType.STRING)
    Genre genre;

}