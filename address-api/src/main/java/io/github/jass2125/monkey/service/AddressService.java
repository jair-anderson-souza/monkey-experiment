package io.github.jass2125.monkey.service;

import io.github.jass2125.monkey.entity.Address;
import io.github.jass2125.monkey.repository.AddressRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    private List<Address> fallback = List.of();

    @Cacheable(value = "addresses")
    public List<Address> getAll() {
        return this.addressRepository.findAll();
    }

    @Cacheable(cacheNames = "addresses", key = "#id", unless="#result == null")
    public Address getById(Long id) {
        return this.addressRepository.findById(id).orElse(null);
    }



}
