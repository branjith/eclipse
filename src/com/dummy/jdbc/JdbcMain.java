package com.dummy.jdbc;


import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class JdbcMain {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");  
      
    FgaDao dao=(FgaDao)ctx.getBean("edao");    
    
          
    int status=dao.updateEmployee(); 
    System.out.println(status); 
      
          
    /*Employee e=new Employee(); 
    e.setId(102); 
    int status=dao.deleteEmployee(e); 
    System.out.println(status);*/  
      
}  
  
}  

