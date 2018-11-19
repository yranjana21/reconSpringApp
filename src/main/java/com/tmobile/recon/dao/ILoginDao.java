package com.tmobile.recon.dao;

import org.springframework.stereotype.Repository;

import com.tmobile.recon.model.Login;

@Repository
public interface ILoginDao {

	public String loginUser(Login login);

}
