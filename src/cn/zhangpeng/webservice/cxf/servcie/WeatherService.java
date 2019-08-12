package cn.zhangpeng.webservice.cxf.servcie;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.soap.SOAPBinding;

/**
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:cn.zhangpeng.webservice.cxf.servcie
 * @Version:1.0
 */
@WebService(serviceName = "GetWeatherService",name = "WeatherService",portName = "WeatherServicePort")
//发布soap1.2
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
//配置soap消息样式为rpc
@javax.jws.soap.SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.RPC)
public interface WeatherService {
    //通过注解配置wsdl相关内容
    @WebMethod(operationName = "getWeatherMethod")
    @WebResult(name = "getWeather")
    @RequestWrapper(className = "java.lang.String")
    @ResponseWrapper(className = "java.lang.String")
    public abstract String getWeather(@WebParam(name = "cityName",mode = WebParam.Mode.IN) String cityName);
}
