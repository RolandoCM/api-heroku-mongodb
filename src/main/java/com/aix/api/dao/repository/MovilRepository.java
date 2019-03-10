package com.aix.api.dao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aix.api.dao.entity.MovilEntity;

public interface MovilRepository extends  MongoRepository<MovilEntity, String>{

}
