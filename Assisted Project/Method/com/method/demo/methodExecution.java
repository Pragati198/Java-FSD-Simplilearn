package com.method.demo;

public class methodExecution 
{
	public int multipynumbers(int a,int b) 
	{
		int C=a*b;
		return C;
	}

	public static void main(String[] args)
	{

		methodExecution b=new methodExecution();
		int ans= b.multipynumbers(4,15);
		System.out.println("Multipilcation is :"+ans);
    }


}
