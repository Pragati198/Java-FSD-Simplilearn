package com.constructor2;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class ParamConstructor 
{
	public static void main(String[] args) 
	{

		Std std1=new Std(1,"Rahul");
		Std std2=new Std(4,"Avni");
		std1.display();
		std2.display();
	}


}
