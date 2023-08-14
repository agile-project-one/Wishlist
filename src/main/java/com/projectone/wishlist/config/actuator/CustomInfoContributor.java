package com.projectone.wishlist.config.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, Object> customDetails = new HashMap<>();
        customDetails.put("Application Name", "Wishlist Microservice");
        customDetails.put("version", "1.0.0");
        customDetails.put("Application Owner", "Israr Ahmad");
        customDetails.put("email", "isr.project.one@gmail.com");
        LocalDateTime deploymentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        customDetails.put("deploymentTime", deploymentTime.format(formatter));
        customDetails.put("environment", "Development");

        Map<String, Object> endpoints = new HashMap<>();
        endpoints.put("health", "http://localhost:9191/admin/healthCheck");
        endpoints.put("info", "http://localhost:9191/admin/applicationInfo");
        endpoints.put("metrics", "http://localhost:9191/actuator/metrics");
        customDetails.put("endpoints", endpoints);

        builder.withDetail("customInfo", customDetails).build();
    }
}
