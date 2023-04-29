package org.example.core.model.response;

public class UserResponseModel {

    String name;
    String creationTime;

    public UserResponseModel() {
    }

    public UserResponseModel(final String name, final String creationTime) {
        this.name = name;
        this.creationTime = creationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(final String creationTime) {
        this.creationTime = creationTime;
    }

}
