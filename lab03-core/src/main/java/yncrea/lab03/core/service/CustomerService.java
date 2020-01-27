package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.CustomerRepository;
import yncrea.lab03.core.entity.Customer;

@Service
@Transactional
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void deleteAll() {
        //TODO implement
        customerRepository.deleteAll();
    }


    public void save(Customer customer) {
        //TODO implement
        customerRepository.save(customer);
    }


    public long countAll() {
        //TODO implement
        return customerRepository.count();
    }
}
