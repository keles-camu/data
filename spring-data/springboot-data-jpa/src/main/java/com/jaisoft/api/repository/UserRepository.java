package com.jaisoft.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaisoft.api.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
}
