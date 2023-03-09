package neevocjp;

import java.io.IOException;

public class TestApp1 
{
	public static void isValidAge(int age) throws InvalidAgeExceptioin
	{
		
		if (age < 18) 
		{
			throw new InvalidAgeExceptioin("Invalid Age\n\tPkease enter between 1 to 18 ");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			isValidAge(17);
		} catch (InvalidAgeExceptioin e) 
		{
			e.printStackTrace();
		}
	}
}
