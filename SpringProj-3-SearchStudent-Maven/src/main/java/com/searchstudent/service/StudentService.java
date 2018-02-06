package com.searchstudent.service;

import java.util.List;

import com.searchstudent.dto.StudentResult;
import com.searchstudent.dto.StudentSearchParam;

public interface StudentService {
	public List<StudentResult> searchStudent(StudentSearchParam params);

}
