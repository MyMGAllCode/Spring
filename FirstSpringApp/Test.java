package com.firstspringapp.client;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.firstspringapp.pojo.Student;

public class Test 
{
	public static void main(String[] args) 
	{
		String cfgfile="D://HyderaBadTraing/Project/FirstSpringApp/myBeans.xml";
	
FileSystemResource resource=new FileSystemResource(cfgfile);
//Create Container 
XmlBeanFactory factory=new XmlBeanFactory(resource);
//get the spring bean obj from Container
//To get bean obj from container we can call
//public obj getBean(String BeanName)
Object obj =factory.getBean("std");
Student std=(Student)obj;//Downcasting
System.out.println(std.getStudentName()+","+std.getStudentId());
	}
}
