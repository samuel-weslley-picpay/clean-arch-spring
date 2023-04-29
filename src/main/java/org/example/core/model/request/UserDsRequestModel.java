package org.example.core.model.request;

import java.time.LocalDateTime;

public class UserDsRequestModel {

    String name;
    String password;
    LocalDateTime creationTime;

    public UserDsRequestModel(final String name, final String password, final LocalDateTime creationTime) {
        this.name = name;
        this.password = password;
        this.creationTime = creationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(final LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

}
