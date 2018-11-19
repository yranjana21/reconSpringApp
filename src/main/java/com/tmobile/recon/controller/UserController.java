package com.tmobile.recon.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmobile.recon.model.User;
import com.tmobile.recon.service.IUserService;

@RestController
// @CrossOrigin(origins = "http://localhost:3000")
@RequestMapping ("/recon/user")
public class UserController {
	private static final Log log = LogFactory.getLog(UserController.class);

	@Autowired
	private IUserService userService;

	// -------------------User Registration---------------
	@PostMapping (value = "/register")
	public User registerUser(@RequestBody User user) {
		log.info("UserController::register");
		return userService.saveUser(user);
	}

	// --------------------------Get User Details----------
	@RequestMapping ("/get")
	public User getUser(@RequestBody User user) {
		log.info("emailId----" + user.getEmail());
		return userService.getUser(user.getEmail());
	}
	//---------------editProfile
	@RequestMapping ("/edit")
	public User editProfile(@RequestBody User user) {
		log.info("emailId----" + user.getEmail());
		return userService.getUser(user.getEmail());
	}
	//------------save edited Profile
	@RequestMapping ("/saveEdit")
	public User saveEditProfile(@RequestBody User user) {
		log.info("emailId----" + user.getEmail());
		return userService.saveUser(user);
	}
}
