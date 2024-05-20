package com.customer.customer.repository;

import com.customer.customer.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository <Customer,Long>{


}
