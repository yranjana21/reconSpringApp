package com.tmobile.recon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmobile.recon.model.Login;

@Repository
public interface LoginRepository extends MongoRepository<Login, String> {

	@Query ("{userName:'?0'}")
	Login findUserByUserName(String userName);

}
