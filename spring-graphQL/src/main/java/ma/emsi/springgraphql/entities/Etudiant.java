package ma.emsi.springgraphql.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.emsi.springgraphql.enums.Genre;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Table(name = "etudiants")
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "nom_etudiant",nullable = false)
    String nom;
    @Column(name = "prenom_etudiant")
    String prenom;
    @Enumerated(EnumType.STRING)
    Genre genre;
    @ManyToOne
    @NonNull
    @JoinColumn(name = "centre_id")
    Centre centre;
}
