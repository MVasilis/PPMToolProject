package io.vasilismartos.ppmtool.web;

import io.vasilismartos.ppmtool.domain.Project;
import io.vasilismartos.ppmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project){
        Project createdProject = projectService.saveorUpdate(project);
        return new ResponseEntity<Project>(createdProject, HttpStatus.CREATED);
    }
}
