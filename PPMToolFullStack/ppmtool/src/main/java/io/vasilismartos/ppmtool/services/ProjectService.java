package io.vasilismartos.ppmtool.services;

import io.vasilismartos.ppmtool.domain.Project;
import io.vasilismartos.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;



    public Project saveorUpdate(Project project){

        // business Logic

        return projectRepository.save(project);
    }
}
