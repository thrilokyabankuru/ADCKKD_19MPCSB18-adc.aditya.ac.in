import java.util.*;
class seive_prime_count
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Query");
int Q=s.nextInt();
int w=1;
while(w<=Q)
{
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

for(int j=n+1;j<r;j++)
{
if(primearray[j]==1)  // 2 3 5 7 23 37 53 73 
count++;
}
System.out.println(count);
}
w+=1;
}
}
}