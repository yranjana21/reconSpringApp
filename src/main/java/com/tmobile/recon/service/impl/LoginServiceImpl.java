package com.tmobile.recon.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmobile.recon.controller.LoginController;
import com.tmobile.recon.dao.ILoginDao;
import com.tmobile.recon.model.Login;
import com.tmobile.recon.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService {
	private static final Log log = LogFactory.getLog(LoginController.class);

	@Autowired
	private ILoginDao loginDao;

	@Override
	public String validateUser(Login login) {
		log.info("LoginServiceImpl::validateUser");
		return loginDao.loginUser(login);
	}

}
