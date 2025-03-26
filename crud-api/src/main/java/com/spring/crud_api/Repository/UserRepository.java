package com.spring.crud_api.Repository;

import com.spring.crud_api.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUuid(UUID uuid);

    void deleteByUuid(UUID uuid);
}
