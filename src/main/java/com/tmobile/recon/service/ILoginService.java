package com.tmobile.recon.service;

import org.springframework.stereotype.Service;

import com.tmobile.recon.model.Login;

@Service
public interface ILoginService {

	public String validateUser(Login login);

}
