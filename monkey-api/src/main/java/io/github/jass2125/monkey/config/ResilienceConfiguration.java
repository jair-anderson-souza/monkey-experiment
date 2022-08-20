package io.github.jass2125.monkey.config;


import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig.SlidingWindowType;
import io.github.resilience4j.common.circuitbreaker.configuration.CircuitBreakerConfigCustomizer;
import io.github.resilience4j.common.retry.configuration.RetryConfigCustomizer;

@Configuration
public class ResilienceConfiguration {

    @Bean
    public CircuitBreakerConfigCustomizer circuitBreakerConfigCustomizer() {
        return CircuitBreakerConfigCustomizer.of(
            "default-circuit-breaker",
            builder -> builder
                .slidingWindowType(SlidingWindowType.COUNT_BASED)
                .slidingWindowSize(10)
                .failureRateThreshold(50)
                .slowCallRateThreshold(10)
                .slowCallDurationThreshold(Duration.ofSeconds(1))
                .waitDurationInOpenState(Duration.ofSeconds(5)));
    }

    @Bean
    public RetryConfigCustomizer retryConfigCustomizer() {
        return RetryConfigCustomizer.of(
            "default-retry",
            builder -> builder
                .failAfterMaxAttempts(true)
                .maxAttempts(5)
                .waitDuration(Duration.ofSeconds(5))
                .retryExceptions(Exception.class));
    }
}
