package com.tmobile.recon.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmobile.recon.dao.ITaskFlowDataDAO;
import com.tmobile.recon.model.TaskFlowData;
import com.tmobile.recon.repository.TaskFlowDataRepository;

@Repository
public class TaskFlowDataDaoImpl implements ITaskFlowDataDAO {
	private static final Log log = LogFactory.getLog(TaskFlowDataDaoImpl.class);

	@Autowired
	private TaskFlowDataRepository taskFlowDataRepository;

	@Override
	public List<TaskFlowData> getTaskFlowData() {
		log.info("ITaskFlowDataDaoImpl :: Get flow data List");
		return taskFlowDataRepository.findAll();
	}

	@Override
	public void saveTaskFlowData(TaskFlowData taskFlowData) {
		taskFlowDataRepository.save(taskFlowData);
	}

	

}
