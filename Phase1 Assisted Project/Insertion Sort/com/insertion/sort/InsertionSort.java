package com.insertion.sort;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
        int[] arr = {10,20,40,55,50};
        insertionSort(arr);		
		for (int i : arr) 
		{			
			System.out.print(i+" ");
		}

	}	
	 public static void insertionSort(int[] arr)
	 {
		 int len = arr.length;
		 for(int j=1;j<len;j++)
		 {
			 int key = arr[j];
		     int i=j-1;
		     while ((i>-1) && (arr[i]>key))
		     {
		    	 arr[i+1]=arr[i];
		         i--;
		     }
		    arr[i+1]=key;
		  }

	 }

}
