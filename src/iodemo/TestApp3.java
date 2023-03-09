package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul", 12);
		try 
		{
			FileOutputStream fout = new FileOutputStream("srcd.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s);
		
			System.out.println("Student Records write in file");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
