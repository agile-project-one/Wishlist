package com.projectone.wishlist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Wishlist Microservice: API Reference and Usage")
                        .description("The Wishlist Microservice API allows you to manage wishlists for users, enabling the addition and removal of products to/from wishlists. Each wishlist entry is associated with a unique wishlist ID, user ID, product ID, and category.\n" +
                                "\n" +
                                "This API provides endpoints to interact with wishlists, facilitating seamless integration with your application's user experience. Whether you're building an e-commerce platform or a personalized content application, the Wishlist Microservice API simplifies the process of handling user-specific wishlists.\n" +
                                "\n" +
                                "Explore the endpoints and functionalities documented below to efficiently incorporate wishlist management into your application.")
                        .version("1.0"));
    }
}