package com.tmobile.recon.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document (collection = "TaskFlowData")
public class TaskFlowData {
	
	private String entityId;
	
	private Object flowData;

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Object getFlowData() {
		return flowData;
	}

	public void setFlowData(Object flowData) {
		this.flowData = flowData;
	}
	
	
}
