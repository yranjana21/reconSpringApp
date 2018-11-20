package com.tmobile.recon.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tmobile.recon.model.Login;
import com.tmobile.recon.service.ILoginService;

@RestController
@RequestMapping ("/recon")
public class LoginController {

	private static final Log log = LogFactory.getLog(LoginController.class);

	@Autowired
	private ILoginService loginService;

	/// ----------------Login-----------------
	@RequestMapping (value = "/login", method = RequestMethod.POST)
	public ResponseEntity<HttpStatus> validateLogin(@RequestBody Login login) {
		log.info("Username-" + login.getuserName());
		String result = loginService.validateUser(login);

		System.out.println(result);
		if (result.equals("email & password exists")){
			return new ResponseEntity<HttpStatus>(HttpStatus.FOUND);
		} else{
			return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
		}

	}

}
