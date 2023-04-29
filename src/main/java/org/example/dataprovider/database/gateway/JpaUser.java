package org.example.dataprovider.database.gateway;

import org.example.core.gateway.UserRegisterDsGateway;
import org.example.core.model.request.UserDsRequestModel;
import org.example.dataprovider.database.entity.UserDataMapper;
import org.example.dataprovider.database.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JpaUser implements UserRegisterDsGateway {

    final JpaUserRepository repository;

    @Autowired
    public JpaUser(final JpaUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsByName(final String name) {
        return repository.existsByName(name);
    }

    @Override
    public void save(final UserDsRequestModel requestModel) {
        UserDataMapper accountDataMapper = new UserDataMapper(requestModel.getName(), requestModel.getPassword(), requestModel.getCreationTime());

        repository.save(accountDataMapper);
    }

}
