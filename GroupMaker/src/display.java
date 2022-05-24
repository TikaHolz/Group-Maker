
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class display
	{
public static int groupNumber = 0;
public static int groupSize = 0;
	public static void numberOfGroups()
		{
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("What would you like to sort by?");
		System.out.println("\t (1) Group Size");
		System.out.println("\t (2) Number of Groups");
		System.out.println("\t (3) Print Roster");
		int sizeOrNumber = userIntInput.nextInt();
	
		
		if(sizeOrNumber==1)
			{
			// group size
			System.out.println("What group size do you want?");
			groupSize = userIntInput.nextInt();
			}
		else if(sizeOrNumber == 2)
			{
			//group Number
			System.out.println("How many groups do you want?");
			groupNumber = userIntInput.nextInt();
			}
		else if(sizeOrNumber == 3)
			{
			//prints array list
		for(int i = 0; i < GroupMaker.studentL.size(); i++)
				{
				System.out.println(GroupMaker.studentL.get(i));
				}
			}
		else
			{
			System.out.println("That is not an option. Please restart the program and try again");
			}

		}
	public static void printOutGroups()
		{
		int groups = groupNumber;
		System.out.println("Project One");
		
	
		
		
		System.out.println("Project Two");
		
		
		
		
		
		
		System.out.println("Project Three");
		}
	}
