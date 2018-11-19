package com.tmobile.recon.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmobile.recon.dao.IUserDao;
import com.tmobile.recon.model.Login;
import com.tmobile.recon.model.User;
import com.tmobile.recon.repository.LoginRepository;
import com.tmobile.recon.repository.UserRepository;

@Repository
public class UserDaoImpl implements IUserDao {
	private static final Log log = LogFactory.getLog(UserDaoImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public User saveUser(User user) {
		Login l1 = new Login();
		l1.setUsername(user.getEmail());
		l1.setPassword(user.getPassword());
		loginRepository.save(l1);
		return userRepository.save(user);

	}

	@Override
	public User getUser(String emailId) {
		log.info("UserDaoImpl :: Get user List");
		User userFromDb = userRepository.findUserByEmail(emailId);
		if (userFromDb != null){
			return userFromDb;
		} else{
			return null;
		}

	}
}
