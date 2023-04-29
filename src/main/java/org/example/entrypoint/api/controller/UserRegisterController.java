package org.example.entrypoint.api.controller;

import lombok.RequiredArgsConstructor;
import org.example.core.boundary.UserInputBoundary;
import org.example.core.model.request.UserRequestModel;
import org.example.core.model.response.UserResponseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserRegisterController {

    private final UserInputBoundary userInput;

    @PostMapping("user")
    UserResponseModel create(@RequestBody UserRequestModel requestModel) {
        return userInput.create(requestModel);
    }

    @GetMapping("user")
    String get() {
        return "funcionou";
    }

}
