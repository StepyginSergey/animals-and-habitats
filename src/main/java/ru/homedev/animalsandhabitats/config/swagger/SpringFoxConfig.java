package ru.homedev.animalsandhabitats.config.swagger;


import io.swagger.annotations.Api;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SpringFoxConfig {

  @Bean
  public Docket docket() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo());
  }


  public ApiInfo apiInfo() {
    return new ApiInfo(
        "Звери и места их обитания",
        "API проекта",
        "1.0",
        "",
        new Contact("API Owner", "url", "owner@mail.ru"),
        "api_license",
        "",
        new ArrayList<>()
    );
  }
}
