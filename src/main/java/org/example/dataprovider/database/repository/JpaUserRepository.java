package org.example.dataprovider.database.repository;

import org.example.dataprovider.database.entity.UserDataMapper;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends MongoRepository<UserDataMapper, Long> {

    boolean existsByName(String name);

}
