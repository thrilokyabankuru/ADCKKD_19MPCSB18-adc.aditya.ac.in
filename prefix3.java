import java.util.*;
class prefix3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
int n=s.nextInt();
int a[]=new int[n];
a[0]=1;
for(int i=1;i<n;i++)
{
a[i]=a[i-1]*i;
}
System.out.println("Enter Query");
int Q=s.nextInt();
for(int j=0;j<Q;j++)
{
int fact=s.nextInt();
System.out.println(a[fact]);
}
}
}