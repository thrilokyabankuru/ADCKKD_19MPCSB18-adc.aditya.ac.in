/*write a program to count total number of prime factors to the given number*/

import java.util.*;
class Primefactor_count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
while(n%2==0)
{
count+=1;
n=n/2;
}
//System.out.println(count);
for(int i=3;i<=Math.sqrt(n);i+=2)
{
while(n%i==0)
{
count+=1;
//System.out.println(count);
n=n/i;
}
}

if(n>2)
count+=1;
System.out.println(count);
}
}