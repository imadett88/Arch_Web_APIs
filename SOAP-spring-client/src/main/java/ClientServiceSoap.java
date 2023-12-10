import proxy.EtudiantWService;
import proxy.ServiceWeb;
import proxy.Student;

import java.util.List;

public class ClientServiceSoap {
    public static void main(String[] args) {
        EtudiantWService wsdl = new ServiceWeb().getEtudiantWServicePort();
        List<Student> liste = wsdl.listStudents();
        liste.forEach(elm->{System.out.println(elm.getNom()
        +"____"+elm.getPrenom());});
    }
}
