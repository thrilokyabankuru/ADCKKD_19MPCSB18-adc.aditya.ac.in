// program to print nth fibbanocci nmbr using brute force 0 1 1 2 3 5 8 

import java.util.*;
class nfib
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=0,b=1,count=0;
int n=s.nextInt();
if(n==2)
count=1;
for(int i=2;i<n;i++)
{
count=a+b; 
a=b;
b=count;
}
System.out.println(count);
}
}