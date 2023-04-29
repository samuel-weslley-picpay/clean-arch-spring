package org.example.core.gateway;

import org.example.core.model.request.UserDsRequestModel;

public interface UserRegisterDsGateway {

    boolean existsByName(String name);

    void save(UserDsRequestModel requestModel);

}
