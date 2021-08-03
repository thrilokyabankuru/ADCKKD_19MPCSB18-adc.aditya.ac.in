/*Develop a program using prefix algorithm to find sum of
multiples of 3 upto x for Q queries. Take maxSize as 1000.
Example1:
Input :
3 // Queries
2 //input
9
1 // input
3
3 // input
18/ */

import java.util.*;
class prefix_multiple3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n+1];
a[1]=3;
for(int i=2;i<=n;i++)
{
a[i]=(a[1]*i)+a[i-1];
}
System.out.println("enter query");
int Q=s.nextInt();
while(Q>0)
{
int n1=s.nextInt();
System.out.println(a[n1]);
Q--;
}
}
} 
