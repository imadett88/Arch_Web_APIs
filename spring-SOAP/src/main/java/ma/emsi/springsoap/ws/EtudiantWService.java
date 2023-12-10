package ma.emsi.springsoap.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import ma.emsi.springsoap.entity.Student;
import ma.emsi.springsoap.enums.Genre;

import java.util.List;

@WebService(serviceName = "serviceWeb")
public class EtudiantWService {
    @WebMethod(operationName = "listStudents")
    public List<Student> listStudents(){
        return List.of(
                new Student(1,"ETTAMEN_Nom1","IMAD_Prenom1", Genre.HOMME),
                new Student(1,"ELMESSOUADI_Nom1","AYMANE_Prenom1", Genre.HOMME),
                new Student(1,"EZZAKI_Nom1","MOHAMED_Prenom1", Genre.HOMME)
        );
    }
}
