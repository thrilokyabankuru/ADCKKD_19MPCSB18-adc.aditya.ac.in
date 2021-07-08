import java.util.*;
class array_operations
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
if(i<n-1)
System.out.print(a[i]+" ");
if(i==n-1)
System.out.print((a[i]+1)+" ");
}
}
}


