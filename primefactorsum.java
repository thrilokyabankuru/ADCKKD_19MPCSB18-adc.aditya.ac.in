import java.util.*;
class primefactorsum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
while(n%2==0)
{
sum+=2;
n=n/2;
}
for(int i=3;i<=Math.sqrt(n);i+=2)
{
while(n%i==0)
{
sum+=i;
n=n/i;
}
}
if(n>2)
sum+=n;
System.out.println(sum);
}
}

