package com.tmobile.recon.service;

import org.springframework.stereotype.Service;
import com.tmobile.recon.model.TaskFlowData;

@Service
public interface ITaskFlowDataService {

	public void saveData(TaskFlowData taskFlowData);

}
