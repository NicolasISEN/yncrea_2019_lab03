package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yncrea.lab03.core.entity.BusinessType;
import yncrea.lab03.core.entity.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
