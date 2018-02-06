/**
 * 
 */
package com.searchstudent.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.searchstudent.dto.StudentResult;
import com.searchstudent.dto.StudentSearchParam;

/**
 * @author DKP
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private SessionFactory factory;

	@Override
	public List<StudentResult> searchStudent(StudentSearchParam searchParam) {
		StringBuffer sql = new StringBuffer("SELECT s.sId, s.sName,s.course,s.fee FROM Stusent as s ");
		boolean isFirst = true;
		if (searchParam != null) {
			if (searchParam.getsId() != null && searchParam.getsId() > 0) {
				sql.append("where s.sId=" + searchParam.getsId()+"");
				isFirst = false;
			} // if
			if (searchParam.getsName() != null && searchParam.getsName().trim().length() > 0) {
				if (isFirst) {
					sql.append("where s.sName=" + searchParam.getsName()+"");
					isFirst = false;
				} // if
				else {
					sql.append("AND s.sName=" + searchParam.getsName()+"");
				} // else
			} // if
			if (searchParam.getCourse() != null && searchParam.getCourse().trim().length() > 0) {
				if (isFirst) {
					sql.append("where s.course=" + searchParam.getCourse()+"");
					isFirst = false;
				} // if
				else {
					sql.append("AND s.course=" + searchParam.getCourse()+"");
				} // else

			} // if
		}
		//Get Hibernate Session 
		
		Session  session=factory.openSession();
		
		
		Query query =session.createQuery(sql.toString());
		List<StudentResult>studentResult=query.list();
		return studentResult;

	}

}
