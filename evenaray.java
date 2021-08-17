import java.util.*;
class evenarray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
int h=0;
int k=1;
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
{
b[h]=a[i];
h+=2;
}
else
{
b[k]=a[i];
k+=2;
}
}
for(int a1:b)
System.out.print(a1+" ");
}
}
