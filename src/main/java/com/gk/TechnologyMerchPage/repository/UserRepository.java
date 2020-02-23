package com.gk.TechnologyMerchPage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gk.TechnologyMerchPage.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

//	User findByUsername(String username);
}
