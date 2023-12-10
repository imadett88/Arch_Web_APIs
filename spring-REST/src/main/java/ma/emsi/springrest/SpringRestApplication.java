package ma.emsi.springrest;

import ma.emsi.springrest.Repository.EtudiantRepository;
import ma.emsi.springrest.enums.Genre;
import ma.emsi.springrest.model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public void run(String... args) throws Exception {
        Etudiant et1 = Etudiant.builder()
                .nom("Ettamen")
                .prenom("Imad")
                .genre(Genre.HOMME)
                .build();
        etudiantRepository.save(et1);
    }
}
