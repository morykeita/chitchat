package com.morykeita.userservice.repository;

import com.morykeita.userservice.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
   UserEntity findByEmail(String email);
}
