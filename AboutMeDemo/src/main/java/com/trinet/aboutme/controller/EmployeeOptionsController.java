package com.trinet.aboutme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.EmployeeOptionsDTO;

/**
 * 
 * @author Srinivasa Pavan
 *
 */
@RequestMapping("/EmployeeOptionsAPI")
public interface EmployeeOptionsController {

	@RequestMapping(value="/employeeOptions", method=RequestMethod.PUT)
	List<EmployeeOptionsDTO> updateEmployeeOptions(@RequestBody Object obj);
}
