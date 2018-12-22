package org.sollunae.openapifirst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket apiContract() {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("open-api-first")
            .select()
            .apis(RequestHandlerSelectors.basePackage("org.sollunae.openapifirst.rest"))
            .build()
            .host("localhost:8080")
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Greeter API")
            .license("LGPL3")
            .version("0.0.1")
            .contact(new Contact("Jeroen van Maanen", "https://github.com/jeroenvanmaanen", "jeroen@sollunae.net"))
            .build();
    }
}
