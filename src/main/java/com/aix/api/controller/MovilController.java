package com.aix.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aix.api.dao.entity.MovilEntity;
import com.aix.api.service.IMovilService;

@RestController
@RequestMapping("/api")
public class MovilController {
@Autowired
private IMovilService movilService;

	@GetMapping("/movil")
	public ResponseEntity<?> getAllMovil(){
		Map<String, Object> response = new HashMap<String, Object>();
		List<MovilEntity> moviles = movilService.findAll();
		response.put("moviles", moviles);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	@PostMapping("/movil")
	public ResponseEntity<?> save(@RequestBody MovilEntity movil){
		Map<String, Object> response = new HashMap<String, Object>();
		MovilEntity movilSave = movilService.save(movil);
		response.put("movil", movilSave);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
}
