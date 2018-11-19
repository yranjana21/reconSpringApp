package com.tmobile.recon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmobile.recon.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	@Query ("{email:'?0'}")
	User findUserByEmail(String email);

}
