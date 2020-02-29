package io.vasilismartos.ppmtool.web;

import io.vasilismartos.ppmtool.domain.Project;
import io.vasilismartos.ppmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){
        if(result.hasErrors()){
            return new ResponseEntity<String>("Invalid Request", HttpStatus.BAD_REQUEST);
        }

        Project createdProject = projectService.saveorUpdate(project);
        return new ResponseEntity<Project>(createdProject, HttpStatus.CREATED);
    }
}
