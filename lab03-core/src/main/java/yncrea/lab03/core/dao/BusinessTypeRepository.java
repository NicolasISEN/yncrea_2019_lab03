package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.BusinessType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public interface BusinessTypeRepository extends CrudRepository<BusinessType,Long> {
    @Override
    <S extends BusinessType> S save(S s);

    @Override
    long count();

    @Override
    void deleteAll();
}
