package com.tmobile.recon.dao;

import org.springframework.stereotype.Repository;

import com.tmobile.recon.model.User;

@Repository
public interface IUserDao {

	public User saveUser(User user);

	public User getUser(String emailId);

}
