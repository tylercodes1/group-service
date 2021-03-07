package com.tkapps.social.service.group.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket (DocumentationType.SWAGGER_2);
    }

    // TODO finish after hosting
//    private ApiInfo apiDetails() {
//        return new ApiInfo("Messaging Service API", "API for Tyler's Messaging API", "0.1", "All Rights Reserved",
//                new springfox.documentation.service.Contact("Messaging Service",
//                        "https://github.com/tylercodes1/messaging-service","tylerkim@outlook.com"),
//                "Tyler Kim", "", Collections.emptyList());
//    }
}
