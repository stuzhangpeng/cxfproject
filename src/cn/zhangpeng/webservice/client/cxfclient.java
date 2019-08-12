package cn.zhangpeng.webservice.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @Auther:zhangpeng
 * @Date:2019/8/12
 * @Description:cn.zhangpeng.webservice.client
 * @Version:1.0
 */

public class cxfclient {
    public static void main(String[] args) {
        //通过该类创建client
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean=new JaxWsProxyFactoryBean();
        //设置服务接口
        jaxWsProxyFactoryBean.setServiceClass(WeatherService.class);
        //设置服务地址
        jaxWsProxyFactoryBean.setAddress("http://localhost:8888/weather");
        WeatherService weatherService = jaxWsProxyFactoryBean.create(WeatherService.class);
        String yichun = weatherService.getWeatherMethod("yichun");
        System.out.println(yichun);
    }
}
