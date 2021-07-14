
import java.util.*;
class prime
{
int count=0,count1=0;
void twin(int p,int q)
{
for(int i=p;i<=q;i++)
{
for(int j=1;j<=i;j++)
{
if(i%j==0)
count+=1;
}
if(count==2)
count1+=1;
count=0;
}
System.out.print(count1/2);
}
}

class twin_primes_count
{
public static void main(String args[])
{
int n,n1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
n1=s.nextInt();
prime t=new prime();
t.twin(n,n1);
}
}

