package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yncrea.lab03.core.entity.BusinessType;


public interface BusinessTypeRepository extends CrudRepository<BusinessType, Long> {

}
