package com.wuchengdong.config;
/*
 *此类是配置外部资源映射
 */

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.apache.tomcat.util.net.SSLHostConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@PropertySource("classpath:config.properties")
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Value("${staticResourcePath}")
    String staticResourcePath;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println(staticResourcePath);
        registry.addResourceHandler("/upload/**").addResourceLocations(staticResourcePath+"/");
//        registry.addResourceHandler("upload/**").addResourceLocations(staticResourcePath+"/");
        registry.addResourceHandler("/login/upload/**").addResourceLocations(staticResourcePath+"/");
        registry.addResourceHandler("/backgroundTable/upload/**").addResourceLocations(staticResourcePath+"/");
        registry.addResourceHandler("/yanxuekechengDetail/upload/**").addResourceLocations(staticResourcePath+"/");
        registry.addResourceHandler("/jidiDetail/upload/**").addResourceLocations(staticResourcePath+"/");
        registry.addResourceHandler("/_yanxuekecheng/upload/**").addResourceLocations(staticResourcePath+"/");
    }


    //如果要同时拥有http并重定向至https端口上，可用下面的代码实现

    @Bean
    public Connector httpConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("https");
        //Connector监听的http的端口号
        connector.setPort(80);
        connector.setSecure(false);
        //监听到http的端口号后转向到的https的端口号
         connector.setRedirectPort(443);
        return connector;
    }

    @Bean
    public TomcatServletWebServerFactory tomcatServletWebServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstraint = new SecurityConstraint();
                securityConstraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection securityCollection = new SecurityCollection();
                securityCollection.addPattern("/*");
                securityConstraint.addCollection(securityCollection);
                context.addConstraint(securityConstraint);
            }
        };
        factory.addAdditionalTomcatConnectors(httpConnector());
        return factory;
    }

}
