package io.communet.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>function:
 * <p>User: leejohn
 * <p>Date: 16/7/8
 * <p>Version: 1.0
 */
@SpringBootApplication
@EnableWebMvc
@ImportResource({"classpath:spring-context*.xml"})//导入原先的context初始化文件
@Slf4j
public class AdminWebApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AdminWebApplication.class);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("{} boot successfully", "admin-web");
    }


    @Bean
    public FilterRegistrationBean shiroFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new DelegatingFilterProxy());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("targetFilterLifecycle", "true");
        registration.setName("shiroFilter");
        return registration;
    }

//    @Bean
//    public ServletRegistrationBean springServlet(){
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new DispatcherServlet(), "/");
//        Map<String, String> initParameters = new HashMap<>();
//        initParameters.put("contextConfigLocation","classpath*:/spring-mvc*.xml");
//        servletRegistrationBean.setInitParameters(initParameters);
//        servletRegistrationBean.setLoadOnStartup(1);
//        return servletRegistrationBean;
//    }





}