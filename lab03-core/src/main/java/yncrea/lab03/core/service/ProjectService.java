package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.ProjectRepository;
import yncrea.lab03.core.entity.Project;

import java.util.List;

@Service
@Transactional
public class ProjectService {


    ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void deleteAll() {
        projectRepository.deleteAll();
    }

    public void save(Project project){
        projectRepository.save(project);
    }

    public long countAll() {
        return projectRepository.count();
    }

    public List<Project> findAll(){
        return projectRepository.findAll();
    }
}
