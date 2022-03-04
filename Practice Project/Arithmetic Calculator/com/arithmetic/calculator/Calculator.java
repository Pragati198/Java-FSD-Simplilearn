package com.arithmetic.calculator;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{

	    char operator;
	    Double num1, num2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);
	   

	    // ask users to enter numbers
	    System.out.println("Enter first number: ");
	    num1 = input.nextDouble();

	    System.out.println("Enter second number: ");
	    num2 = input.nextDouble();
	    
	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    switch (operator) 
	    {
	    //addition
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      //subtraction
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      //multiplication
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      //division
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    
	  }
	
}




	
