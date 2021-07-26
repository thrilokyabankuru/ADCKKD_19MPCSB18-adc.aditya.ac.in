import java.util.*;
class prime_count
{
public static void main(String args[])
{
int n,count1=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int j=2;j<=n;j++)
{
int count=0;
for(int i=1;i<=j;i++)
{
if(j%i==0)
count+=1;
}
if(count==2)
count1+=1;
}
System.out.println(count1);
}
}

