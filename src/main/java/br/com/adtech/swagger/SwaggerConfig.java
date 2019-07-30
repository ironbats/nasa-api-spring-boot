package br.com.adtech.swagger;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
public class SwaggerConfig  extends WebMvcConfigurationSupport {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.adtech"))
				.paths(PathSelectors.any())
				.build().apiInfo(apiInfo());
	}


	private ApiInfo apiInfo() {
		Collection<VendorExtension> vendorExtensions = new ArrayList<>();
		return new ApiInfo(
						"The Nasa Api Messages",
						"Application get information to asteroids ",
						"v1.0",
						"swagger",new Contact("Felipe Rodrigues","swagger","felipe.themarkiron"), "felipe.themarkiron@gmail.com",
				"",
				Arrays.asList(new VendorExtension() {
					@Override
					public String getName() {
						return "Felipe Rodrigues";
					}

					@Override
					public Object getValue() {
						return null;
					}
				}));
	}


	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html")
				.addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
