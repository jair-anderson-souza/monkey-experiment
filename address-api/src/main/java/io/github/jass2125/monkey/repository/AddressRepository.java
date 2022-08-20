package io.github.jass2125.monkey.repository;

import io.github.jass2125.monkey.entity.Address;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addresses")
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAll();

}
