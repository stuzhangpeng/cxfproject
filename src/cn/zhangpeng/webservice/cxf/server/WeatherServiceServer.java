package cn.zhangpeng.webservice.cxf.server;

import cn.zhangpeng.webservice.cxf.servcie.WeatherService;
import cn.zhangpeng.webservice.cxf.serviceimpl.WeatherServiceImpl;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**使用cxf发布webservice服务
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:cn.zhangpeng.webservice.cxf.server
 * @Version:1.0
 */
public class  WeatherServiceServer {
    public static void main(String[] args) {
        //使用该类发布webservice服务
        JaxWsServerFactoryBean jaxWsServerFactoryBean=new JaxWsServerFactoryBean();
        //设置服务地址
        jaxWsServerFactoryBean.setAddress("http://localhost:8888/weather");
        //设置发布服务的接口
        jaxWsServerFactoryBean.setServiceClass(WeatherService.class);
        //设置发布服务的实现类
        jaxWsServerFactoryBean.setServiceBean(new WeatherServiceImpl());
        //发布服务
        //在发布之前加入拦截器
        jaxWsServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
        jaxWsServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        jaxWsServerFactoryBean.create();
    }
}
