package com.tmobile.recon.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tmobile.recon.model.TaskFlowData;
import com.tmobile.recon.service.ITaskFlowDataService;

@RestController
@RequestMapping ("/recon")
public class TaskFlowDataController {

	private static final Log log = LogFactory.getLog(TaskFlowDataController.class);

	@Autowired
	private ITaskFlowDataService taskFlowDataService;

	@RequestMapping (value = "/taskFlowData", method = RequestMethod.POST)
	public String saveData(@RequestBody TaskFlowData taskFlowData) {

		log.info("TaskFlowDataController : saveData");
		taskFlowDataService.saveData(taskFlowData);
		return "Data Saved successfully";

	}

}
