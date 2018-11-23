package com.tmobile.recon.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmobile.recon.dao.ITaskFlowDataDAO;
import com.tmobile.recon.model.TaskFlowData;
import com.tmobile.recon.service.ITaskFlowDataService;

@Service
public class TaskFlowDataServiceImpl implements ITaskFlowDataService {
	private static final Log log = LogFactory.getLog(TaskFlowDataServiceImpl.class);

	@Autowired
	ITaskFlowDataDAO taskFlowDataDao;

	@Override
	public void saveData(TaskFlowData taskFlowData) {
		taskFlowDataDao.saveTaskFlowData(taskFlowData);
		
	}

}
