package com.tmobile.recon.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;
import com.tmobile.recon.model.Login;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Import(LoginController.class)
public class LoginControllerTest {

	private static final Log log = LogFactory.getLog(LoginControllerTest.class);

	@Autowired
	private MockMvc mockMvc;

	Login login;
	String json;

	@Test
	public void testValidateLogin() {
		login = new Login();
		login.setUsername("444@gmail.com");
		login.setPassword("444");
		json = new Gson().toJson(login);
		try {
			this.mockMvc
					.perform(post("/recon/login").accept(MediaType.APPLICATION_JSON)
							.contentType(MediaType.APPLICATION_JSON).content(json))
					.andExpect(status().is3xxRedirection()).andDo(print());
			log.info("Test Validate Login Done-----");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

	}

}
