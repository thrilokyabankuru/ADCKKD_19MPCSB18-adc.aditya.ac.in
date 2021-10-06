/*write a program to generate sum of n even numbers for q queries .max value of n is 100 
ex: 2---no of quires
    2---n value //2 4
    6---sum of first even numbers
    5---n value
    30--sum of first 5 even numbers  */

import java.util.*;
class sumeven
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int Q=s.nextInt();
while(Q!=0)
{
int even=0;
int n=s.nextInt();
if(n<=100)
{
for(int i=1;i<n+1;i++)
even=even+i*2; 
System.out.println(even);
}
Q--;
}
}
}



