package io.github.jass2125.monkey.mapper;

import io.github.jass2125.monkey.entity.Address;
import io.github.jass2125.monkey.dto.AddressRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AddressMapper {

    public abstract Address toAddress(AddressRequest addressRequest);

}
