package com.fitedpro.shop.repos;

import com.fitedpro.shop.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

}