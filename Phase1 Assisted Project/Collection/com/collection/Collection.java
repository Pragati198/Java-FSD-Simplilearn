package com.collection;
import java.util.*;

public class Collection 
{
	public static void main(String[] args) 
	{
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Mumbai");//
	      city.add("Pune");    	   
	      System.out.println(city);  
	      
	  	//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(10); 
	      vec.addElement(20); 
	      System.out.println(vec);
	      
	  	//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Avni");  
	      names.add("Rahul");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next()); 
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(11);  
	       set.add(12);  
	       set.add(13);
	       set.add(14);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(15);  
	       set2.add(16);  
	       set2.add(17);
	       set2.add(18);	       
	       System.out.println(set2);
	      	} 
    }  
	}

	       

		




