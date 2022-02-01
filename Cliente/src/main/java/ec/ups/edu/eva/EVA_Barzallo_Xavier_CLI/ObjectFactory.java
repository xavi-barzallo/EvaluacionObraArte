
package ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _CrearContacto_QNAME = new QName("http://bean.eva.edu.ups.ec/", "crearContacto");
    private final static QName _CrearContactoResponse_QNAME = new QName("http://bean.eva.edu.ups.ec/", "crearContactoResponse");
    private final static QName _GetContactos_QNAME = new QName("http://bean.eva.edu.ups.ec/", "getContactos");
    private final static QName _GetContactosResponse_QNAME = new QName("http://bean.eva.edu.ups.ec/", "getContactosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearContacto }
     * 
     */
    public CrearContacto createCrearContacto() {
        return new CrearContacto();
    }

    /**
     * Create an instance of {@link CrearContactoResponse }
     * 
     */
    public CrearContactoResponse createCrearContactoResponse() {
        return new CrearContactoResponse();
    }

    /**
     * Create an instance of {@link GetContactos }
     * 
     */
    public GetContactos createGetContactos() {
        return new GetContactos();
    }

    /**
     * Create an instance of {@link GetContactosResponse }
     * 
     */
    public GetContactosResponse createGetContactosResponse() {
        return new GetContactosResponse();
    }

    /**
     * Create an instance of {@link Obra }
     * 
     */
    public Obra createObra() {
        return new Obra();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearContacto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearContacto }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.eva.edu.ups.ec/", name = "crearContacto")
    public JAXBElement<CrearContacto> createCrearContacto(CrearContacto value) {
        return new JAXBElement<CrearContacto>(_CrearContacto_QNAME, CrearContacto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearContactoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearContactoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.eva.edu.ups.ec/", name = "crearContactoResponse")
    public JAXBElement<CrearContactoResponse> createCrearContactoResponse(CrearContactoResponse value) {
        return new JAXBElement<CrearContactoResponse>(_CrearContactoResponse_QNAME, CrearContactoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContactos }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.eva.edu.ups.ec/", name = "getContactos")
    public JAXBElement<GetContactos> createGetContactos(GetContactos value) {
        return new JAXBElement<GetContactos>(_GetContactos_QNAME, GetContactos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContactosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.eva.edu.ups.ec/", name = "getContactosResponse")
    public JAXBElement<GetContactosResponse> createGetContactosResponse(GetContactosResponse value) {
        return new JAXBElement<GetContactosResponse>(_GetContactosResponse_QNAME, GetContactosResponse.class, null, value);
    }

}
