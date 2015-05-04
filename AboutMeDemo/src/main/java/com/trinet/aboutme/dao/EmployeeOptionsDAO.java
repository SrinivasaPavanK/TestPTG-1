package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.EmployeeOptions;
import com.trinet.aboutme.dtos.EmployeeOptionsDTO;

public interface EmployeeOptionsDAO {
	
	List<EmployeeOptionsDTO> updateEmployeeOptions(EmployeeOptionsDTO employeeOptionsDTO);
}
