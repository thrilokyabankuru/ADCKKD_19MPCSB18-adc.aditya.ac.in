import java.util.*;
class prefix2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=1;i<n;i++)
{
a[i]=a[i-1]+2*i;
}
System.out.println("enter query");
int Q=s.nextInt();
for(int j=0;j<Q;j++)
{
int sum=s.nextInt();
System.out.println(a[sum]);
}
}
}