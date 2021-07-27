/*find the mega primes in the given range i.e. 1 to 100
output-->8 (2,3,5,7,23,37,53,73)*/
import java.util.*;
class mega_primes
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=s.nextInt();
int count=0,rem=0;
if(r<3)
System.out.println("0");
else
{
int primearray[]=new int[r+1];
for(int i=2;i<=r;i++)
{
primearray[i]=1;
}
for(int p=2;p*p<=r;p++)
{
if(primearray[p]==1)
for(int i=p*p;i<=r;i=i+p)
{
primearray[i]=0;
}
}
for(int j=n;j<=r;j++)
{
if(j%10==j) 
{
if(primearray[j]==1)  // 2 3 5 7 23 37 53 73 
count++;
}
else
{
if(primearray[j]==1)
{
int y=j;
int t=-1;
int flag=-1;
while(y!=0)
{
rem=y%10;
t++;
if(primearray[rem]==1)
flag++;
y=y/10;
}
if(flag==t)
count+=1;
}
}
}
}
System.out.println(count);
}
}