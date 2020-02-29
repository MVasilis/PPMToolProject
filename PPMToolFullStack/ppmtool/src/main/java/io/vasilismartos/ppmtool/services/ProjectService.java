package io.vasilismartos.ppmtool.services;

import io.vasilismartos.ppmtool.domain.Project;
import io.vasilismartos.ppmtool.exceptions.ProjectIdException;
import io.vasilismartos.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;



    public Project saveorUpdate(Project project){
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }catch (Exception e){
            throw new ProjectIdException("Project Id '" + project.getProjectIdentifier().toUpperCase() + "'already exist");
        }
    }
}
