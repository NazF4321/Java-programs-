import java.io.IOException;
import java.util.Scanner;
class knapsack
{
  public static void main(String args[])throws IOException
  {
    int i,j=0,max_qty,m,n;
	float sum = 0,max;
	Scanner sc = new Scanner(System.in);
	int array[][]=new int[2][20];
	System.out.println("enter number of items");
	n=sc.nextInt();
	System.out.println("enter the weights of each item");
	for(i=0;i<n;i++)
	array[0][i]=sc.nextInt();
	System.out.println("enter the values of each item");
	for(i=0;i<n;i++)
	array[1][i]=sc.nextInt();
	System.out.println("enter maximum value of knapsack :");
	max_qty= sc.nextInt();
	m=max_qty;
	while(m>0)
	{
	  max=0;
	  for(i=0;i<n;i++)
	  {
	   if(((float)array[1][i])/((float)array[0][i])>max)
	   {
	     max=(((float)array[1][i])/((float)array[0][i]));
		 j=i;
	   }
	  }
	  if(array[0][j]>m)
	  {
	    System.out.println("quantity of item number:"+(j+1)+"added is"+m);
		sum+=m*max;
		m=-1;
	  }
	  else
	  {
	    System.out.println("quantity of item number :"+(j+1)+"added is"+array[0][j]);
		m-=array [0][j];
		sum+=(float)array[1][j];
		array[1][j]=0;
	  }
	 }
	 System.out.println("the total profit is" +sum);
	 sc.close();
	}
}
		 
	