package io.github.jass2125.monkey.model;


import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
//import org.springframework.data.redis.core.RedisHash;

@Entity
@Table(name = "person")
@EqualsAndHashCode
public class Person implements Serializable {

    @Id
//    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(name = "person_seq", initialValue = 1001, allocationSize = 1)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}