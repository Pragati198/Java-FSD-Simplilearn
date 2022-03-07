package com.locker;
import java.util.Scanner;

public class WelcomeScreen 
{
	private void selectChoice() 
	{
		// Code for WelcomeScreen
		Scanner scanner = new Scanner(System.in); 
		System.out.println("===============Main Menu===============\n" 
		                   +"1.Retrive files\n"
				           + "2.Businees level operation on files:-\n" 
		                   + "  i.Add files\n" 
				           + "  ii.Delete files\n"
					       + "  iii.Search files\n" 
		                   + "  iv.Go to Main Menu\n" 
					       + "3.Close application.\n");

		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt(); // Taking input from user

		// Switch statement
		switch (choice) 
		{
		  case 1:
			  RetrieveFile retrieveFiles = new RetrieveFile();
			// displaying retrieve files class
			  retrieveFiles.display(); 
			  System.out.println("\n");
			// displaying welcome screen
			  display(); 
			  break;

		 case 2:
			 BusinessLevelOperation businessLevelOperation = new BusinessLevelOperation();
			// display add files, delete files, search files, main menu
			 businessLevelOperation.display(); 
			 break;
			 
		 case 3:
			 System.out.println("Thanks for using Locker Application");
			 System.out.println("Closing your Application.....");
			 System.out.println("--------------------------------------------------");
			 break;
			 
			 default:
				 System.out.println("Please enter valid input.");
				 break;
			}
		}

		public void display() 
		{
			selectChoice();
		}
	}


