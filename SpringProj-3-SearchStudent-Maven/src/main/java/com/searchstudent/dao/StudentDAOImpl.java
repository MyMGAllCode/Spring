/**
 * 
 */
package com.searchstudent.dao;

import java.util.ArrayList;
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
		StringBuffer sql = new StringBuffer("SELECT s.sId, s.sname,s.course,s.fee FROM Student as s ");
		boolean isFirst = true;
		List<StudentResult> studentResultList=new ArrayList<StudentResult>();
		if (searchParam != null) {
			if (searchParam.getsId() != null && searchParam.getsId() > 0) {
				sql.append(" where s.sId= '" + searchParam.getsId() + "' ");
				isFirst = false;
			} // if
			if (searchParam.getsName() != null && searchParam.getsName().trim().length() > 0) {
				if (isFirst) {
					sql.append(" where s.sname='" + searchParam.getsName() + "' ");
					isFirst = false;
				} // if
				else {
					sql.append(" AND s.sname='" + searchParam.getsName() + "' ");
				} // else
			} // if
			if (searchParam.getCourse() != null && searchParam.getCourse().trim().length() > 0) {
				if (isFirst) {
					sql.append(" where s.course='" + searchParam.getCourse() + "' ");
					isFirst = false;
				} // if
				else {
					sql.append(" AND s.course='" + searchParam.getCourse() + "' ");
				} // else

			} // if
		}
		// Get Hibernate Session

		Session session = factory.openSession();

		Query query = session.createQuery(sql.toString());
		List<Object[]>list = query.list();
		for(Object [] obj:list){
			StudentResult st=new StudentResult();
			st.setsId((Integer)obj[0]);
			st.setsName((String)obj[1]);
			st.setCourse((String)obj[2]);
			st.setFee((Double)obj[3]);
			studentResultList.add(st);
		}
		return studentResultList;

	}

}
