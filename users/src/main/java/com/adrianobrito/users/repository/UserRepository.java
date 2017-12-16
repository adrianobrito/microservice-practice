package com.adrianobrito.users.repository;

import com.adrianobrito.users.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {}
