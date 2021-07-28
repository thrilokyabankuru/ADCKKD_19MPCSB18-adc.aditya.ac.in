import java.util.*;
class twin_primescount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=s.nextInt();
int count=0;
int prime[]=new int[r+1];   //2 3 4 5 6 7
for(int i=1;i<=r;i++)
prime[i]=1;
prime[1]=0;
for(int p=2;p*p<=r;p++)
{
if(prime[p]==1)
for(int i=p*p;i<=r;i+=p)
prime[i]=0;
}
for(int j=n;j<=r-2;j++)
{                                                        
if(prime[j]==1 && prime[j+2]==1)
{
count+=1;
System.out.print("["+j+","+(j+2)+"]"+" ");
}
}
System.out.print("--->"+count);
}
}


