/*printing twin primes in between ranges */
import java.util.*;
class twinprimes_range
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=100000;
int prime[]=new int[n+1];
for(int i=0;i<=n;i++)
{
prime[i]=1;
}
prime[1]=0;
for(int p=2;p*p<=n;p++)
{
if(prime[p]==1)
for(int i=p*p;i<=n;i=i+p)
{
if(prime[i]==1)
prime[i]=0;
}
}
int start,end;
int count=0;
System.out.print("Enter prime starting range:");
start=sc.nextInt();
System.out.print("Enter prime ending range:");
end=sc.nextInt();
for(int j=start;j<=end;j++)
{
if(end-start>=2)
if((prime[j]==1)&&(prime[j+2]==1))
System.out.printf("[%d,%d] ",j,j+2);
}
}
}