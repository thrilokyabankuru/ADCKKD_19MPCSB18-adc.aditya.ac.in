import java.util.*;
class array_even_product
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
if(a[i]%2==0)
count+=1;
else
count1+=1;
}
if((count*count1)%2==0)
System.out.print("Even number");
else
System.out.print("Odd number");
}
}