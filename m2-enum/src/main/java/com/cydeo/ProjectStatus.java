package com.cydeo;

public enum ProjectStatus {
    OPEN, CLOSED, PROGRESS("IN PROGRESS");

    private String value;

    ProjectStatus(String value) {
        this.value = value;
    }

    ProjectStatus() {
    }

    public String getValue() {
        return value;
    }
}
