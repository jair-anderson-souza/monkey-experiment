package io.github.jass2125.monkey.mapper;

import io.github.jass2125.monkey.dto.PersonRequest;
import io.github.jass2125.monkey.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PersonMapper {

    public abstract Person toPerson(PersonRequest personRequest);

}
