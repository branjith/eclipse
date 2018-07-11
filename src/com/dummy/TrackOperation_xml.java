package com.dummy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect  
public class TrackOperation_xml{    
    public void k(){}
    
    public void myadviceBefore(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("BEFORE : additional concern");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }  
    
    public void myadviceAfter(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("AFTER : additional concern");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }  
    
                
  public void myadviceReturn(JoinPoint jp,Object result1)//it is advice (after returning advice)  
  {  
      System.out.println("RETURN additional concern");  
      System.out.println("RETURN Method Signature: "  + jp.getSignature());
      System.out.println("RETURN Result in advice: "+result1);  
      System.out.println("RETURN end of after returning advice...");  
  }  
        
        
    public Object myadviceAround(ProceedingJoinPoint pjp) throws Throwable   
    {  
        System.out.println("AROUND: Additional Concern Before calling actual method");  
        Object obj=pjp.proceed();  
        System.out.println("AROUND: Additional Concern After calling actual method");  
        return obj;  
    }  
             
  public void myadviceThrow(JoinPoint jp,Throwable error)//it is advice  
  {  
      System.out.println("THROW : additional concern");  
      System.out.println("THROW : Method Signature: "  + jp.getSignature());  
      System.out.println("THROW : Exception is: "+error);  
      System.out.println("THROW : end of after throwing advice...");  
  }  
    
} 