package com.spring.mini.project.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        Class[] configClasses = {AppConfig.class};
        return configClasses;
    }

    @Override
    protected String[] getServletMappings() {

        String[] mappings = {"/"};
        return mappings;
    }
}
