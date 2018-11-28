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
import com.tmobile.recon.model.TaskFlowData;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Import(TaskFlowDataController.class)
public class TaskFlowDataControllerTest {

	private static final Log log = LogFactory.getLog(TaskFlowDataControllerTest.class);

	@Autowired
	private MockMvc mockMvc;

	TaskFlowData taskFlowData;
	String json;

	@Test
	public void testSaveData() {
		taskFlowData = new TaskFlowData();
		taskFlowData.setEntityId("TestEntityId");
		taskFlowData.setFlowData(null);
		json = new Gson().toJson(taskFlowData);
		try {
			this.mockMvc
					.perform(post("/recon/taskFlowData").accept(MediaType.APPLICATION_JSON)
							.contentType(MediaType.APPLICATION_JSON).content(json))
					.andExpect(status().is2xxSuccessful()).andDo(print());
			log.info("Test Save Data Done-----");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

	}

}
