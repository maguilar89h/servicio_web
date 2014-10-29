
package pauqete_web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NuevoWebService", targetNamespace = "http://pauqete_web/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NuevoWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://pauqete_web/", className = "pauqete_web.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://pauqete_web/", className = "pauqete_web.HelloResponse")
    @Action(input = "http://pauqete_web/NuevoWebService/helloRequest", output = "http://pauqete_web/NuevoWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param nombre
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "setNombrePersona", targetNamespace = "http://pauqete_web/", className = "pauqete_web.SetNombrePersona")
    @ResponseWrapper(localName = "setNombrePersonaResponse", targetNamespace = "http://pauqete_web/", className = "pauqete_web.SetNombrePersonaResponse")
    @Action(input = "http://pauqete_web/NuevoWebService/setNombrePersonaRequest", output = "http://pauqete_web/NuevoWebService/setNombrePersonaResponse")
    public void setNombrePersona(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre);

}