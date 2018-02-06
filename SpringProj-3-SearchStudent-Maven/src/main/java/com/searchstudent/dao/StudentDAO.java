package com.searchstudent.dao;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.searchstudent.dto.StudentResult;
import com.searchstudent.dto.StudentSearchParam;

public interface StudentDAO {
	public List<StudentResult> searchStudent(StudentSearchParam studentDTO);


}
