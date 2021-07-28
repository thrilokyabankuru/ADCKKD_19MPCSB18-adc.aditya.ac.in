//WRITE PROGRAM TO PRINT N PRIME NUMBERS IN REVERSE ORDER
import java.util.*;
class seive_reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int prime[]=new int[n+1];
for(int i=1;i<=n;i++)
prime[i]=1;
prime[1]=0;
for(int p=2;p*p<=n;p++)
{
if(prime[p]==1)
for(int i=p*p;i<=n;i+=p)
prime[i]=0;
}
for(int j=n;j>0;j--)
{
if(prime[j]==1)
System.out.print(j+" ");
}
}
}

