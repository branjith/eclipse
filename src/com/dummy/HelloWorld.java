package com.dummy;

public class HelloWorld {
	   private String message,str;

	   
	   HelloWorld(){
		   str="";
	   }
	   
	   HelloWorld(String str){
		   this.str=str;
	   }
	   
	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message+" :: "+str);
	   }
	}