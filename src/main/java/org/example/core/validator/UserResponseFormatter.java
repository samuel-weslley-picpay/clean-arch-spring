package org.example.core.validator;

import org.example.core.model.response.UserResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class UserResponseFormatter implements UserPresenter{

    @Override
    public UserResponseModel prepareSuccessView(final UserResponseModel user) {
        LocalDateTime responseTime = LocalDateTime.parse(user.getCreationTime());
        user.setCreationTime(responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        return user;
    }

    @Override
    public UserResponseModel prepareFailView(final String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

}
