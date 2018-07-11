package com.dummy.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeMain {  
  
public static void main(String[] args) {  
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("prepstmt.xml");  
    	long startTime = System.nanoTime(); 
    	EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    	dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",35000));  
	}  
}  