package com.projectone.wishlist.config.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // Check the health of your component here
        boolean isHealthy = true;

        if (isHealthy) {
            String customMessage = "Wishlist microservice is up and running smoothly!";
            return Health.up().withDetail("message", customMessage).build();
        } else {
            return Health.down().withDetail("Wishlist microservice", "Not available").build();
        }
    }
}
