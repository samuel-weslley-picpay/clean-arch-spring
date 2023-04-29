package org.example.dataprovider.broker.interator;

import lombok.RequiredArgsConstructor;
import org.example.core.boundary.UserInputBoundary;
import org.example.core.gateway.UserRegisterDsGateway;
import org.example.core.model.request.UserDsRequestModel;
import org.example.core.model.request.UserRequestModel;
import org.example.core.model.response.UserResponseModel;
import org.example.core.usercase.User;
import org.example.core.usercase.UserFactory;
import org.example.core.validator.UserPresenter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Component
public class UserRegisterInteractor implements UserInputBoundary {

    final UserRegisterDsGateway userDsGateway;
    final UserPresenter userPresenter;
    final UserFactory userFactory;

    @Override
    public UserResponseModel create(final UserRequestModel requestModel) {
        if (userDsGateway.existsByName(requestModel.getLogin())) {
            return userPresenter.prepareFailView("User already exists.");
        }

        User user = userFactory.create(requestModel.getLogin(), requestModel.getPassword());

        if (!user.passwordIsValid()) {
            return userPresenter.prepareFailView("User password must have more than 5 characters.");
        }

        LocalDateTime now = LocalDateTime.now();

        UserDsRequestModel userDsModel = new UserDsRequestModel(user.getName(), user.getPassword(), now);

        userDsGateway.save(userDsModel);

        UserResponseModel accountResponseModel = new UserResponseModel(user.getName(), now.toString());

        return userPresenter.prepareSuccessView(accountResponseModel);
    }

}
