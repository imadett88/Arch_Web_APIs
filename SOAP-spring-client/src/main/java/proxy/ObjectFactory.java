
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ListStudents_QNAME = new QName("http://ws.springsoap.emsi.ma/", "listStudents");
    private static final QName _ListStudentsResponse_QNAME = new QName("http://ws.springsoap.emsi.ma/", "listStudentsResponse");
    private static final QName _Student_QNAME = new QName("http://ws.springsoap.emsi.ma/", "student");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListStudents }
     * 
     * @return
     *     the new instance of {@link ListStudents }
     */
    public ListStudents createListStudents() {
        return new ListStudents();
    }

    /**
     * Create an instance of {@link ListStudentsResponse }
     * 
     * @return
     *     the new instance of {@link ListStudentsResponse }
     */
    public ListStudentsResponse createListStudentsResponse() {
        return new ListStudentsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     * @return
     *     the new instance of {@link Student }
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStudents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListStudents }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.springsoap.emsi.ma/", name = "listStudents")
    public JAXBElement<ListStudents> createListStudents(ListStudents value) {
        return new JAXBElement<>(_ListStudents_QNAME, ListStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStudentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListStudentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.springsoap.emsi.ma/", name = "listStudentsResponse")
    public JAXBElement<ListStudentsResponse> createListStudentsResponse(ListStudentsResponse value) {
        return new JAXBElement<>(_ListStudentsResponse_QNAME, ListStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Student }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.springsoap.emsi.ma/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<>(_Student_QNAME, Student.class, null, value);
    }

}
