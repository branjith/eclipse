package com.dummy;

import java.util.Iterator;
import java.util.Map;

public class Xi {

	static int myX =0;
	String tmp;
	tibet t1;
	
	public Xi(){
	}
	
	public Xi(String tmp,tibet t1){
		this.tmp=tmp;
		this.t1=t1;
	}
	
	void myString(){
		myX++;
		StringBuffer sb = new StringBuffer();
		sb.append("tmp:"+tmp+"\n");
		sb.append("t1.id:"+t1.id+"\n");
		Iterator it = t1.oliver.keySet().iterator();
		int x;
		while(it.hasNext()){
			x=Integer.valueOf((String)it.next());
			sb.append("x:"+x+"\n");
			sb.append("string:"+t1.oliver.get(String.valueOf(x))+"\n");
		}
		System.out.println(sb.toString());
		if(myX>2){
			System.out.println("???????????? before throwing exception");
			throw new ArithmeticException("Throwing Excpetion");
		}
	}
}

class tibet {
	int id;
	Map<Integer,String> oliver;
	
	public tibet(){
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setOliver(Map oliver){
		this.oliver=oliver;
	}
	
	public tibet(int id,Map m){
		this.id=id;
		oliver = m;
	}
}

class A {  
	String myValue;
	
	public A(String myValue){
		this.myValue=myValue;
	}
	
	public static A getA(){  
    	return new A("prognosis negative");  
	}  
}

class Operation{  
    public void msg(){System.out.println("msg method invoked");}  
    public int m(){System.out.println("m method invoked");return 2;}  
    public int k(){System.out.println("k method invoked");return 3;}  
    public void ten() throws Exception{	throw new Exception();}
}
