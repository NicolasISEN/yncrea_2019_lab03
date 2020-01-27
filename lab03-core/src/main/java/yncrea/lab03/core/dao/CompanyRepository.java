package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.Company;

public interface CompanyRepository extends CrudRepository<Company,Long> {
    @Override
    <S extends Company> S save(S s);

    @Override
    long count();

    @Override
    void deleteAll();

    @Override
    Iterable<Company> findAll();


}
