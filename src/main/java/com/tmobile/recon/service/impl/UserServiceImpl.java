package com.tmobile.recon.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmobile.recon.dao.IUserDao;
import com.tmobile.recon.model.User;
import com.tmobile.recon.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	private static final Log log = LogFactory.getLog(UserServiceImpl.class);

	@Autowired
	private IUserDao userDao;

	@Override
	public User saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public User getUser(String emailId) {
		log.info("UserServiceImpl:: getUserDetails");
		return userDao.getUser(emailId);

	}

}
