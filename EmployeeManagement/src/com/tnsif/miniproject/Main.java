package com.tnsif.miniproject;
import java.sql.SQLException;
import java.util.*;
public class Main {
	public static void main(String[] args) throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		int option;
		String choice;
		boolean exit = false;
		System.out.println("Employee Management");
		//whenever the true comes until this while executes
		while(!exit)
		{
			System.out.println("Choose the operation did you perform :");
			System.out.println("1.Insert \n2.Delete \n3.Show \n4.Update \n5.Exit");
			option = sc.nextInt();
			switch(option)
			{
			case 1:
				//Insertion operation
				System.out.println("Number of rows affected : "+Operations.insert());
				break;
			case 2:
				//Deletion operation
				System.out.println("Number of rows affected :"+Operations.delete());
				break;
			case 3:
				//Show operation
				Operations.show();
				break;
			case 4:
				//Update Operation
				System.out.println("Number of rows affected :"+Operations.update());
				break;
			case 5:
				//exit condition
				exit = true;
				System.out.println("Operations are done...");
				break;
			default:
				System.out.println("Invalid option...Choose above option only");
			}
			//Yes or No operation
			System.out.print("Do you want to continue this operation (Y/N)? ");
	        choice = sc.nextLine().trim().toLowerCase();

	        // Check the user's input
	        if (choice.equals("y")) {
	            continue;//if it is 'y' then continue the loop
	        } else if (choice.equals("n")) {
	            System.out.println("Ending the operation."); //is it is 'n' then exit from the loop
	            break;
	        } else {
	            System.out.println("Invalid input. Please enter 'Y' or 'N'.");//this is prompt msg for valid input 
	        }
		}
		sc.close();
	}
}
