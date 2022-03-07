package com.polymorphism;

public class Sum 
{
	public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println(s.sum(5,26)); 
        System.out.println(s.sum(4,8,10)); 
        System.out.println(s.sum(10.5, 20.5));
    } 


}
