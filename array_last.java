//Program to print all zero's in the array to the last position ex: 
//input: 12 0 8 0 9 12 15 16 output: 12 8 9 12 15 16 0 0 

import java.util.*;
class minimum_value1
{
public static void main(String args[])
{
int n,i,j,temp;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println(" Enter values into array ");
for(i=0;i<n;i++)
a[i]=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==0)
{
j=i+1;
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
System.out.print(a[i]);
}
}
}

