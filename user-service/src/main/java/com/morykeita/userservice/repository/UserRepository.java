package com.morykeita.userservice.repository;

import com.morykeita.userservice.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
