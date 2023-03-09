package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("test.txt");
			int temp=0;
			while(		(temp = fin.read()) != -1	) 
			{
				System.out.println(temp +" - "+ (char)+temp);
			}
			
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
