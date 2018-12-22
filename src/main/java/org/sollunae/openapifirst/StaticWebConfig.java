package org.sollunae.openapifirst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.lang.invoke.MethodHandles;

@Configuration
@EnableWebMvc
public class StaticWebConfig implements WebMvcConfigurer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        LOGGER.info("Register static resources");
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/web/", "classpath:/web/");
    }
}
