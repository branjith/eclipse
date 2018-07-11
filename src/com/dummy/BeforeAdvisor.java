package com.dummy;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{  
	@Override  
	public void before(Method method, Object[] args, Object target)throws Throwable {

		//System.out.println("additional concern before actual logic");
		System.out.println("--"+method.getName());
		System.out.println("--"+method.getModifiers());
		System.out.println("--"+method.getParameterCount());
		System.out.println("--"+method.toGenericString());
		System.out.println("--"+method.toString());

		for(Object arg : args){
			System.out.println("++"+arg.getClass());
		}
		System.out.println("** "+target.getClass());
	}  
}  

class AfterAdvisor implements AfterReturningAdvice{  

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("===After Method");

	}  
}  



class InvokeAdvisor implements MethodInterceptor{  

	@Override  
	public Object invoke(MethodInvocation mi) throws Throwable {  
		Object obj;  
		System.out.println("####additional concern before actual logic");  
		obj=mi.proceed();  
		System.out.println("####additional concern after actual logic");  
		return obj;  
	}
}


class ThrowsAdvisor implements ThrowsAdvice{  
    public void afterThrowing(Exception ex){  
        System.out.println(">>>>>additional concern if exception occurs");  
    }  
}  