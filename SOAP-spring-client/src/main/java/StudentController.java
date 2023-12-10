import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import proxy.EtudiantWService;
import proxy.Student;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class StudentController {
    @Autowired
    private EtudiantWService etudiantWService;

    public List<Student> listEtudiants(){
        List<Student> liste = etudiantWService.listStudents();
        List<Student> lsStudents = liste.stream().map(elm -> {
            Student student = new Student();
            student.setId(elm.getId());
            student.setNom(elm.getNom());
            student.setPrenom(elm.getPrenom());
            return student;
        }).collect(Collectors.toList());
        return lsStudents;
    }
}
