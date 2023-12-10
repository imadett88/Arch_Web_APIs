package ma.emsi.springsoap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.springsoap.enums.Genre;



@Data @AllArgsConstructor @NoArgsConstructor
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    int id;
    @Column(name = "nom_etudiant",nullable = false)
    String nom;
    @Column(name = "prenom_etudiant")
    String prenom;
    @XmlTransient //lorsque ont convert en xml ignorer ce attribut
    Genre genre;
}
