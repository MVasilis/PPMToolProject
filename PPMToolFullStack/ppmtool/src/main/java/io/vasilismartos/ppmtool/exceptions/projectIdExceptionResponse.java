package io.vasilismartos.ppmtool.exceptions;

public class projectIdExceptionResponse  {

    private String projectIdentifier;

    public projectIdExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
