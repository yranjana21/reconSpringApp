package com.tmobile.recon.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmobile.recon.controller.LoginController;
import com.tmobile.recon.dao.ILoginDao;
import com.tmobile.recon.model.Login;
import com.tmobile.recon.repository.LoginRepository;

@Repository
public class LoginDaoImpl implements ILoginDao {
	private static final Log log = LogFactory.getLog(LoginController.class);

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public String loginUser(Login login) {

		Login userFromDb = loginRepository.findUserByUserName(login.getuserName());

		if (userFromDb != null){
			if (userFromDb.getPassword().equals(login.getPassword())){

				log.info("email & password exists");

				return "email & password exists";
			} else log.info("password invalid");
			return "password invalid";
		} else{
			log.info("email Not exists");
			return "email Not exists";
		}
	}

}
