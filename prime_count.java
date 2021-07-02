import java.util.*;
class prime_count
{
public static void main(String args[])
{
int n,count=0,count1=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int j=2;j<=n;j++)
{
for(int i=1;i<=j;i++)
{
if(j%i==0)
count+=1;
}
if(count==2)
{
count=0;
count1+=1;
}
else
count=0;
}
System.out.println(count1);
}
}

