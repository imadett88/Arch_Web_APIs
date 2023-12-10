package ma.emsi.springgraphql.repositories;

import ma.emsi.springgraphql.entities.Centre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentreRepository extends JpaRepository<Centre,Long> {
}
