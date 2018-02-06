//package com.nit.SpringJDBCTemplateConfigStyle;
package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.nrt.domain.Employee;
import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
      ApplicationContext context  =new AnnotationConfigApplicationContext(com.nt.cfg.MyBean.class);
      EmployeeDAO employeeDAO=context.getBean("empDao",EmployeeDAOImpl.class);
      
      Employee emp=new Employee();
      emp.setEmpNo(1001);
      emp.setName("Dharmendra");
      emp.setSalary(10000);
      int count =employeeDAO.register(emp);
      
      if(count==1)
    	  System.out.println("Employee Sucessfully Registerd ");
      else 
    	  System.out.println("Sorry!!! :Registration Faild");
      
      
    }
}
