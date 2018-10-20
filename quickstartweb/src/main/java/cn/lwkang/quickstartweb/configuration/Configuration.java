package cn.lwkang.quickstartweb.configuration;

import cn.lwkang.quickstartweb.filter.MyFilter;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public RemoteIpFilter remoteFilterRegisteration() {
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean filterRegisteration(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter( new MyFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("paramName","paramValue");
        registrationBean.setName("MyFilter");
        registrationBean.setOrder(1);
        return  registrationBean;
    }
}
