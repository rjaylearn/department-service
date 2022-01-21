package com.rjay.department.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rjay.department.entity.Department;
import com.rjay.department.service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
//		log.info("inside saveDepartment method of Department controller");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/")
	public List<Department> findDepartments() {
//		log.info("inside findDepartmentById  method of Department controller");
		return departmentService.findDepartment();
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
//		log.info("inside findDepartmentById  method of Department controller");
		return departmentService.findDepartmentById(departmentId);
	}
	
}
