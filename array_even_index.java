//Given an array of integers nums, half of the integers in nums are odd, 
//and the other half are even.
//Sort the array so that whenever nums[i] is odd, i is odd, 
//and whenever nums[i] is even, i is even.
//Return any answer array that satisfies this condition.
//Example 1:
//Input: nums = [4,2,5,7]
//Output: [4,5,2,7]
//Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

import java.util.*;
class array_even_index
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int index=0,index1=0;
int ch[]=new int[n];
int ch1[]=new int[n];
for(int i=0;i<n;i++)
{
ch[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(ch[i]%2==0)       
{
ch1[index]=ch[i];   //4 2 5 7
index+=2;
}
}
index=1;
for(int j=0;j<n;j++)
{
if(ch[j]%2==1)       
{
ch1[index]=ch[j];   //4 2 5 7
index+=2;
}
}
System.out.print("[");
for(int y=0;y<n;y++)
{
System.out.print(ch1[y]);
if(y!=n-1)
System.out.print(",");
}
System.out.print("]");
}
}
      



