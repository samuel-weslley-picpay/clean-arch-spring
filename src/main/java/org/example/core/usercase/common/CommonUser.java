package org.example.core.usercase.common;

import org.example.core.usercase.User;

public class CommonUser implements User {

    String name;
    String password;

    public CommonUser(final String name, final String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean passwordIsValid() {
        return password != null && password.length() > 5;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

}
