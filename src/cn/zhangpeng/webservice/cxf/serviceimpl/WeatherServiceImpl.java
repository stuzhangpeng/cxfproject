package cn.zhangpeng.webservice.cxf.serviceimpl;

import cn.zhangpeng.webservice.cxf.servcie.WeatherService;

import javax.jws.WebService;

/**
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:cn.zhangpeng.webservice.cxf.serviceimpl
 * @Version:1.0
 */
@WebService(endpointInterface = "cn.zhangpeng.webservice.cxf.servcie.WeatherService")
public class WeatherServiceImpl implements WeatherService {
    @Override
    public String getWeather(String cityName) {
        System.out.println(cityName);
        return "raining";
    }
}
