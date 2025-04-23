package com.spring.crud_api.Repository;

import com.spring.crud_api.Dto.UserDto;
import com.spring.crud_api.Entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUuid(UUID uuid);

    @Query(value = "SELECT * FROM users", nativeQuery = true)
    List<UserEntity> findAllUsers();

    void deleteByUuid(UUID uuid);
}
