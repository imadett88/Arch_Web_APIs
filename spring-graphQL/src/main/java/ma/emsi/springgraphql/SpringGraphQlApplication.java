package ma.emsi.springgraphql;

import ma.emsi.springgraphql.entities.Centre;
import ma.emsi.springgraphql.entities.Etudiant;
import ma.emsi.springgraphql.enums.Genre;
import ma.emsi.springgraphql.repositories.CentreRepository;
import ma.emsi.springgraphql.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGraphQlApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringGraphQlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Centre centre1 = Centre.builder()
                .nom("Maarif").adresse("Biranzarane").build();
        centreRepository.save(centre1);
        Centre centre2 = Centre.builder()
                .nom("Oranges").adresse("Oulfa").build();
        centreRepository.save(centre2);
        Etudiant et1 = Etudiant.builder()
                .nom("Ettamen").prenom("Imad").genre(Genre.HOMME)
                .centre(centre1).build();
        etudiantRepository.save(et1);

    }
}
