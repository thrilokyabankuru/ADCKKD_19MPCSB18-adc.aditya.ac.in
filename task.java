/*Given an array arr[] of n integers. The task is to do the following operations:  

Add a value X to all the element  from index A to B where 0 ≤ A ≤ B ≤ N-1.
Find the sum of the element from index L to R  before update and after update for given array elements.

Example: 
Input: n=6,arr[] = {1, 3, 5, 7, 9, 11}, L = 1, R = 3, A = 1, B = 5, X = 10

Output:             
Sum of values in given range before  = 15 
Updated sum of values in given range = 45   */

import java.util.*;
class task
{
public static void main(String args[])
{
int n,sum=0,sum1=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
int prefix[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();                                       //{1, 3, 5, 7, 9, 11}  a=1,b=4
int left,right;
System.out.println("enter left and right values");
left=s.nextInt();
right=s.nextInt();
int A,B;
System.out.println("enter a and b values");
A=s.nextInt();
B=s.nextInt();
System.out.println("enter the value to add");
int x=s.nextInt();
for(int i=0;i<n;i++)
{
if(i>=A && i<=B)
prefix[i]=a[i]+x;
else
prefix[i]=a[i];
}
for(int i=left;i<=right;i++)
{
sum=a[i]+sum;
sum1=prefix[i]+sum1;
}
System.out.println("Sum of values in given range before = "+sum);
System.out.println("Updated sum of values in given range = "+sum1);
}
}