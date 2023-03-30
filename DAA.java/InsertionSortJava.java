import java.util.*;
import java.lang.*;
class InsertionSortJava
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		int arr[]=new int[100];
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		long start=System.nanoTime();
		for(i=1;i<n;i++)
		{
			int temp=arr[i];
			j=i-1;
			while((temp<arr[j])&&(j>=0))
			{
				arr[j+1]=arr[j];
				j--;
			}
		arr[j+1]=temp;
		}
		System.out.println("order of sorted elements");
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