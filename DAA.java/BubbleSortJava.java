import java.util.*;
import java.lang.*;
class BubblesortJava
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		int arr[]=new int[100];
		System.out.println("enter the elements");
		long start=System.nanoTime();
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (arr[i]>arr[j])
				{
					int temp=arr[i];
				   arr[i]=arr[j];
				    arr[j]=temp;
				}
			}
		}
		System.out.println("the elements in sorted order");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		long end=System.nanoTime();
		 
		System.out.println("Time taken"+(end-start));
		long seconds=(end-start);
		double second = (double)seconds/1000000000;
		System.out.println("time taken"+second);
	}
}