#include<stdio.h>
void main()
{
	int k=0,output[10],d=0,t=0,ins[5],i,avail[5],allocated[10][5],need[10][5],MAX[10][5],pno,p[10],rz,j,count=0;
	printf("enter no of resources:");
	scanf("%d",&rz);
	printf("enter max instances of each resources:");
	for(i=0;i<rz;i++)
	{
		avail[i]=0;
		printf("%c=",(i+97));
		scanf("%d",&ins[i]);
	}
	printf("\nenter no of processes:");
	scanf("%d",&pno);
	printf("\nenter the allocated matrix");
	for(i=0;i<rz;i++)
	 printf("%c",(i+97));
	printf("\n");
	for(i=0;i<pno;i++)
	{
		p[i]=i;
		printf("P[%d]",p[i]);
		for(j=0;j<rz;j++)
		{
			scanf("%d",&allocated[i][j]);
			avail[j]+=allocated[i][j];
		}
	}
	printf("\nenter the max matrix");
	for(i=0;i<rz;i++)
	{
		printf("%c",(i+97));
		avail[i]=ins[i]-avail[i];
	}
	printf("\n");
	for(i=0;i<pno;i++)
	{
	
	printf("p[%d]",i);
	for(j=0;j<rz;j++)
	{
		scanf("%d",&MAX[i][j]);
		
	}}
	printf("\n");
	A:d=-1;
	for(i=0;i<pno;i++)
	{
		count=0;
		t=p[i];
		for(j=0;j<rz;j++)
		{
			need[t][j]=MAX[t][j]-allocated[t][j];
			if(need[t][j]<=avail[j])
			 count++;
		}
		if(count==rz)
		{
			output[k++]=p[i];
			for(j=0;j<rz;j++)
			  avail[j]+=allocated[t][j];
			
		}
		else
		{
			p[++d]=p[i];
			
		}
	}
	if(d!=-1)
	{
		pno=d+1;
		goto A;
	}
	printf("\t <");
	for(i=0;i<k;i++)
	{
		printf("p[%d]",output[i]);
	}
	printf(">");
}
