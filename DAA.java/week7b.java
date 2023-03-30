import java.util.*;
import java.lang.*;

class NegativeException extends Exception
{
	public String toString()
	{
		return  "number must be positive";
	}
}
class week7b
{
	public static void main(String []args)
	{
		System.out.println("Enter number of your choice :"); 
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		try
		{
			if(number<0)
			{
				
				throw new NegativeException();
			}
		}
		catch(NegativeException e)
		{
			System.out.println(e);
		}
		
	}
}
