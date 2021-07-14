//2.Write program to print twin primes in the given range.

//Ex: (2,3) (5,7) (11,13)

import java.util.*;
class prime
{
int count=0,flag=0;
void twin(int p)
{
for(int i=2;i<=p;i++)
{
for(int j=1;j<=i;j++)
{
if(i%j==0)
count+=1;
}
if(count==2)
{
flag+=1;
if(flag!=3)
{
if(flag==1)
System.out.print("(");
System.out.print(i);
if(flag!=2)
System.out.print(",");
}
else 
{
System.out.print(")");
flag=1;
System.out.print(" ");
System.out.print("(");
System.out.print(i+",");
}
}
count=0;
}
System.out.print(")");
}
}

class twin_primes
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
prime t=new prime();
t.twin(n);
}
}

