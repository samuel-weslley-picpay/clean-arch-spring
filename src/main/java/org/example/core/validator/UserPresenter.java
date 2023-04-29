package org.example.core.validator;

import org.example.core.model.response.UserResponseModel;

public interface UserPresenter {

    UserResponseModel prepareSuccessView(UserResponseModel user);

    UserResponseModel prepareFailView(String error);

}
