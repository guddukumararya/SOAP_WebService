package org.example.helloserviceprovider;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.4
 * 2025-01-29T13:30:48.076+05:30
 * Generated source version: 4.0.4
 *
 */
@WebService(targetNamespace = "http://helloserviceprovider.example.org/", name = "HelloImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloImpl {

    @WebMethod
    @Action(input = "http://helloserviceprovider.example.org/HelloImpl/sayHelloRequest", output = "http://helloserviceprovider.example.org/HelloImpl/sayHelloResponse")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://helloserviceprovider.example.org/", className = "org.example.helloserviceprovider.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://helloserviceprovider.example.org/", className = "org.example.helloserviceprovider.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
