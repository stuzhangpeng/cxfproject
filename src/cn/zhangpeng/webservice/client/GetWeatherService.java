package cn.zhangpeng.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.17
 * 2019-08-12T14:58:53.462+08:00
 * Generated source version: 3.1.17
 * 
 */
@WebServiceClient(name = "GetWeatherService", 
                  wsdlLocation = "http://localhost:8888/weather?wsdl",
                  targetNamespace = "http://servcie.cxf.webservice.zhangpeng.cn/") 
public class GetWeatherService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servcie.cxf.webservice.zhangpeng.cn/", "GetWeatherService");
    public final static QName WeatherServicePort = new QName("http://servcie.cxf.webservice.zhangpeng.cn/", "WeatherServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8888/weather?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetWeatherService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8888/weather?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetWeatherService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetWeatherService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetWeatherService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GetWeatherService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GetWeatherService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GetWeatherService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WeatherService
     */
    @WebEndpoint(name = "WeatherServicePort")
    public WeatherService getWeatherServicePort() {
        return super.getPort(WeatherServicePort, WeatherService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherService
     */
    @WebEndpoint(name = "WeatherServicePort")
    public WeatherService getWeatherServicePort(WebServiceFeature... features) {
        return super.getPort(WeatherServicePort, WeatherService.class, features);
    }

}
