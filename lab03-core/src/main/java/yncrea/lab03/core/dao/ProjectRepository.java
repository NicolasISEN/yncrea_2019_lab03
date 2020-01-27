package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.Project;

public interface ProjectRepository extends CrudRepository<Project,Long> {
    @Override
    <S extends Project> S save(S s);

    @Override
    long count();

    @Override
    void deleteAll();

    @Override
    Iterable<Project> findAll();
}
