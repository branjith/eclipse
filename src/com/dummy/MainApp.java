package com.dummy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   boolean flag = false;
	   if(flag){
      ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
      System.out.println("Start");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      obj = (HelloWorld) context.getBean("obj1");
      obj.getMessage();
      
      Xi obj1 = (Xi) context.getBean("xi");
      obj1.myString();
      A obj2 = (A) context.getBean("myA");
      System.out.println(obj2.myValue);
      
      Xi a=(Xi)context.getBean("proxy"); 
      System.out.println("before method");
      a.myString();
      System.out.println("END");
      Xi b=(Xi)context.getBean("p1");
      try{
      b.myString();
      }catch(Exception e){
    	  //e.printStackTrace();
      }
      
      /* AspectJ related Tests */
      System.out.println("==========ASPECTJ=================");
      Operation op = (Operation) context.getBean("opBean");
      System.out.println("-------------Calling msg");
      op.msg();
      System.out.println("-------------Calling m");
      System.out.println("++++++++++++"+op.m());
      System.out.println("-------------Calling k");
      System.out.println("++++++++++++"+op.k());
      System.out.println("-------------Calling TEN");
      try{
      op.ten();
      }catch(Exception e){
    	  //e.printStackTrace();
      }
	   }
      
      ApplicationContext context1 = new ClassPathXmlApplicationContext("bean1.xml");
      
      /* XML AspectJ related Tests */
      System.out.println("==========XML : ASPECTJ===============");
      Operation op1 = (Operation) context1.getBean("opBean");
      System.out.println("-------------Calling msg");
      op1.msg();
      System.out.println("-------------Calling m");
      System.out.println("++++++++++++"+op1.m());
      System.out.println("-------------Calling k");
      System.out.println("++++++++++++"+op1.k());
      System.out.println("-------------Calling TEN");
      try{
      op1.ten();
      }catch(Exception e){
    	  //e.printStackTrace();
      }
      
   }
}