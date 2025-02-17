package org.example.helloserviceprovider;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.4
 * 2025-01-29T13:30:48.123+05:30
 * Generated source version: 4.0.4
 *
 */
@WebServiceClient(name = "HelloImplService",
                  wsdlLocation = "file:/C:/Users/COBUY/IdeaProjects/MessageConsumer/src/main/resources/HelloService.wsdl",
                  targetNamespace = "http://helloserviceprovider.example.org/")
public class HelloImplService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://helloserviceprovider.example.org/", "HelloImplService");
    public static final QName HelloImplPort = new QName("http://helloserviceprovider.example.org/", "HelloImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/COBUY/IdeaProjects/MessageConsumer/src/main/resources/HelloService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/COBUY/IdeaProjects/MessageConsumer/src/main/resources/HelloService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HelloImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HelloImpl
     */
    @WebEndpoint(name = "HelloImplPort")
    public HelloImpl getHelloImplPort() {
        return super.getPort(HelloImplPort, HelloImpl.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloImpl
     */
    @WebEndpoint(name = "HelloImplPort")
    public HelloImpl getHelloImplPort(WebServiceFeature... features) {
        return super.getPort(HelloImplPort, HelloImpl.class, features);
    }

}
