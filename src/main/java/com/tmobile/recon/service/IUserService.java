package com.tmobile.recon.service;

import org.springframework.stereotype.Service;

import com.tmobile.recon.model.User;

@Service
public interface IUserService {

	public User saveUser(User user);

	public User getUser(String emailId);

}
