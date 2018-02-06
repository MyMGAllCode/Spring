/**
 * 
 */
package com.searchstudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.searchstudent.dao.StudentDAO;
import com.searchstudent.dto.StudentResult;
import com.searchstudent.dto.StudentSearchParam;

/**
 * @author DKP
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<StudentResult> searchStudent(StudentSearchParam params) {

		
		return studentDAO.searchStudent(params);
	}
	

}
