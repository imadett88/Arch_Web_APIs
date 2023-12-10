package ma.emsi.springgraphql.repositories;

import ma.emsi.springgraphql.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
