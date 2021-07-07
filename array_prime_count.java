import java.util.*;
class array_prime_count
{
public static void main(String args[])
{
int n,count=0,count1=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=1;j<=a[i];j++)
{
if(a[i]%j==0)
count+=1;               // 1 2 3 4 5 6
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
