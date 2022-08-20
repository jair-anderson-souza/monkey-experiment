package io.github.jass2125.monkey.controller;


import io.github.jass2125.monkey.entity.Address;
import io.github.jass2125.monkey.mapper.AddressMapper;
import io.github.jass2125.monkey.service.AddressService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    private static final org.slf4j.Logger log
        = org.slf4j.LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressService service;
    @Autowired
    private AddressMapper addressMapper;


    @GetMapping
    @RequestMapping("/{id}")
    public Address getById(@PathVariable("id") Long id) {
        return this.service.getById(id);
    }

    @GetMapping
    public List<Address> getAll() {
        log.info("buscando addresses");
        return this.service.getAll();
    }

}