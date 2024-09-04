package com.service.deployment.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.deployment.demo.dto.EmployeeDTO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/getEmployees")
	ResponseEntity<EmployeeDTO> getAllEmployees() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		return new ResponseEntity<EmployeeDTO>(employeeDTO, HttpStatus.OK);
	}
}
