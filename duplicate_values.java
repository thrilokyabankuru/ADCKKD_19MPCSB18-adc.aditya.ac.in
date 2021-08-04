import java.util.*;
class duplicate_values
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
Arrays.sort(a);
int flag=0;
for(int i=0;i<a.length-1;i++)
{
if(a[i]==a[i+1] && flag==0)
{
System.out.print(a[i]);
flag=1;
}
else if(a[i]!=a[i+1])
{
flag=0;
}
}
}
}
