package com.tmobile.recon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tmobile.recon.model.TaskFlowData;

@Repository
public interface TaskFlowDataRepository extends MongoRepository<TaskFlowData, String> {

}
