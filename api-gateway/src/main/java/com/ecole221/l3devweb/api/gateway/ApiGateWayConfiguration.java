package com.ecole221.l3devweb.api.gateway;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateWayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/personne/**")
                        .uri("lb://first-service"))
                .route(p -> p.path("/age/**")
                        .uri("lb://second-service"))
                //.route(p -> p.path("/login")
                //        .uri("lb://api-gateway"))
                .build();
    }
}
