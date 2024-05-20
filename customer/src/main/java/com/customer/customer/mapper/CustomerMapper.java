package com.customer.customer.mapper;


import com.customer.customer.requestDto.CreateCustomerRequestDto;
import com.customer.customer.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer createRequestDtoToCustomer (CreateCustomerRequestDto createCustomerRequestDto) ;

}
