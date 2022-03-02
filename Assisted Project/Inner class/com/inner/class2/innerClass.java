package com.inner.class2;

public class innerClass 
{
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }
	 
	 public static void main(String[] args) {
	 	innerClass  ob=new innerClass ();  
	 	ob.display();  
	 	}




}
