package com.customer.customer.service;


import com.customer.customer.entity.Customer;
import com.customer.customer.mapper.CustomerMapper;
import com.customer.customer.requestDto.CreateCustomerRequestDto;
import org.springframework.stereotype.Service;
import com.customer.customer.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;


    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public Customer createOneCustomer(CreateCustomerRequestDto createCustomerRequestDto ) {
        Customer customer = customerMapper.createRequestDtoToCustomer(createCustomerRequestDto);
        return customerRepository.save(customer);
    }

   /* public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }*/

}

