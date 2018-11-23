package com.tmobile.recon.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tmobile.recon.model.TaskFlowData;

@Repository
public interface ITaskFlowDataDAO {

	public List<TaskFlowData> getTaskFlowData();

	public void saveTaskFlowData(TaskFlowData taskFlowData);

}
