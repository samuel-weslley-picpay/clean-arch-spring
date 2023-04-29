package org.example.core.boundary;

import org.example.core.model.request.UserRequestModel;
import org.example.core.model.response.UserResponseModel;

public interface UserInputBoundary {

    UserResponseModel create(UserRequestModel requestModel);

}
