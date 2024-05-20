package com.customer.customer.controller;


import com.customer.customer.requestDto.CreateCustomerRequestDto;
import com.customer.customer.entity.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.customer.customer.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }


    @PostMapping
    public Customer createCustomer (@RequestBody CreateCustomerRequestDto createCustomerRequestDto){
        return customerService.createOneCustomer(createCustomerRequestDto);

    }

    /*@PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        return customerService.saveCustomer(customer);
    }*/



}
