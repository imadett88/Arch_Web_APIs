package ma.emsi.springrest.Repository;

import ma.emsi.springrest.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "students")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findEtudiantByNom(@Param("nom") String nom);
}
