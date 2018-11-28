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

import com.tmobile.recon.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Import(UserController.class)
public class UserControllerTest {
	private static final Log log = LogFactory.getLog(UserControllerTest.class);

	@Autowired
	private MockMvc mockMvc;

	User user;
	String json;

	@Test
	public void testSaveProduct() {
		user = new User();
		user.setEmail("opus@gmail.com");
		user.setFirstName("Opus");
		user.setLastName("Software");
		user.setPassword("Password");
		json = new Gson().toJson(user);
		try {
			this.mockMvc
					.perform(post("/recon/user/register").accept(MediaType.APPLICATION_JSON)
							.contentType(MediaType.APPLICATION_JSON).content(json))
					.andExpect(status().is2xxSuccessful()).andDo(print());
			log.info("Test User Register Done-----");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

	}

}
