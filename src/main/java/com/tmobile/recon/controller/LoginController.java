package com.tmobile.recon.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmobile.recon.model.Login;
import com.tmobile.recon.service.ILoginService;

@RestController
@CrossOrigin (origins = "http://localhost:3000")
@RequestMapping ("/recon")
public class LoginController {

	private static final Log log = LogFactory.getLog(LoginController.class);

	@Autowired
	private ILoginService loginService;

	/// ----------------Login-----------------
	@PostMapping (value = "/login")
	public String validateLogin(@RequestBody Login login) {
		log.info("Username-" + login.getuserName());
		return loginService.validateUser(login);

	}

}
