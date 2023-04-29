package org.example.core.model.request;

public class UserRequestModel {

    String login;
    String password;

    public UserRequestModel() {
        super();
    }

    UserRequestModel(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

}
