// A Program to show multiple-exceptions and catches
class Week7a
{
	public static void main(String args[])
	{
		int a[]={5,6,2,42};
		int n=args.length;
		try
		{
		System.out.println(a[0]);
		int z=64/n;
		System.out.println(z);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("End of the Program");
		}
	}
}