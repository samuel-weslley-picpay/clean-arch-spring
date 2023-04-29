package org.example.core.usercase.common;

import org.example.core.usercase.User;
import org.example.core.usercase.UserFactory;
import org.springframework.stereotype.Component;

@Component
public class CommonUserFactory implements UserFactory {

    @Override
    public User create(final String name, final String password) {
        return new CommonUser(name, password);
    }

}
