
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class GroupMaker 
{
static ArrayList<String> studentL = new ArrayList<String>();;
	public static void main(String[] args) throws IOException 
		{
		
		Scanner myFile = new Scanner(new File("StudentGroupList.txt"));
		
		display.numberOfGroups();
		int counter = 0;
		while(myFile.hasNext())
			{
				counter++;
			}
		for(int i = 0; i < counter; i++)
			{
				String line = myFile.nextLine();
				studentL.add(line);
			}
		
	}
	

}
