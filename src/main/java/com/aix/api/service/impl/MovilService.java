package com.aix.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aix.api.dao.entity.MovilEntity;
import com.aix.api.dao.repository.MovilRepository;
import com.aix.api.service.IMovilService;
@Service
public class MovilService implements IMovilService {

	@Autowired
	private MovilRepository movilRepository;
	@Override
	public MovilEntity save(MovilEntity entity) {
		return movilRepository.save(entity);
	}

	@Override
	public List<MovilEntity> findAll() {
		return movilRepository.findAll();
	}
                                                                              
}
