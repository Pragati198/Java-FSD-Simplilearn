package com.selection.sort;

public class SelectionSort 
{
	public static void main(String[] args) 
	{

		int[] arr = { 15,25,29,55,3,9 };
		int length = arr.length;
		//	Arrays.sort(arr);
	    selectionSort(arr);
	    System.out.println("Elements after sorting");
		for (int element : arr) 
		{
		   System.out.print(element+" ");
		}
 
	}

	public static void selectionSort(int[] arr) 
	{

		for (int i = 0; i < arr.length - 1; i++) 
		{

			int index = i;
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[j] < arr[index]) 
				{

					index = j;
				}

			}
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}

	}


}
