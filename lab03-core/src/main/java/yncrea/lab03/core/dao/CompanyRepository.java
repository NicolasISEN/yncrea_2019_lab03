package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yncrea.lab03.core.entity.BusinessType;
import yncrea.lab03.core.entity.Company;

import java.util.List;
import java.util.Map;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {


}
