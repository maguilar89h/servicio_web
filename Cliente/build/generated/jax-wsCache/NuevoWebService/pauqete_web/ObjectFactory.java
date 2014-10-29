
package pauqete_web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pauqete_web package. 
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

    private final static QName _Hello_QNAME = new QName("http://pauqete_web/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://pauqete_web/", "helloResponse");
    private final static QName _SetNombrePersonaResponse_QNAME = new QName("http://pauqete_web/", "setNombrePersonaResponse");
    private final static QName _SetNombrePersona_QNAME = new QName("http://pauqete_web/", "setNombrePersona");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pauqete_web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SetNombrePersonaResponse }
     * 
     */
    public SetNombrePersonaResponse createSetNombrePersonaResponse() {
        return new SetNombrePersonaResponse();
    }

    /**
     * Create an instance of {@link SetNombrePersona }
     * 
     */
    public SetNombrePersona createSetNombrePersona() {
        return new SetNombrePersona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pauqete_web/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pauqete_web/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNombrePersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pauqete_web/", name = "setNombrePersonaResponse")
    public JAXBElement<SetNombrePersonaResponse> createSetNombrePersonaResponse(SetNombrePersonaResponse value) {
        return new JAXBElement<SetNombrePersonaResponse>(_SetNombrePersonaResponse_QNAME, SetNombrePersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNombrePersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pauqete_web/", name = "setNombrePersona")
    public JAXBElement<SetNombrePersona> createSetNombrePersona(SetNombrePersona value) {
        return new JAXBElement<SetNombrePersona>(_SetNombrePersona_QNAME, SetNombrePersona.class, null, value);
    }

}
