/*Write a program to print substraction of two primes equal to the given target value
if it is equal print "YES"
otherwise Print "NO"
3 5 7 11 13 17 19 23 29 31 37 41 43 47 53
Input :Target value:28
Output:Yes  */


import java.util.*;
class Seivetarget
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=s.nextInt();
int prime[]=new int[r+1];
for(int i=1;i<=r;i++)
prime[i]=1;
prime[1]=0;
for(int p=2;p*p<=r;p++)
{
if(prime[p]==1)
for(int i=p*p;i<=r;i+=p)
prime[i]=0;
}
int target=s.nextInt();
int flag=0;
for(int j=n;j<=target/2;j++)
{
if(prime[j]==1 && prime[target-j]==1)
flag=1;
}

if(flag==1)
System.out.println("yes");
else
System.out.println("no");

}
}



