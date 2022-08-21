package io.github.jass2125.monkey.component;

import io.github.jass2125.monkey.dto.AddressResponse;
import io.github.jass2125.monkey.exceptions.FallbackException;
import io.github.jass2125.monkey.model.Person;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import io.github.resilience4j.retry.annotation.Retry;

@Component
public class AddressComponent {

    private String serviceUrl = "http://localhost:9090/address/";

    public List<Person> getOtherMicroservice() {
        throw new FallbackException("Fallback Exception");
    }

    @CircuitBreaker(name = "circuit-breaker")
    @Retry(name = "retry", fallbackMethod = "fallback")
    public AddressResponse fetchData(Long id) {
        System.out.println(" Making a request to " + serviceUrl + " at :" + LocalDateTime.now());

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, AddressResponse.class);
    }

    public AddressResponse fallback(Exception e) {
        System.out.println("fallback");
        throw new RuntimeException(e);
    }

}
