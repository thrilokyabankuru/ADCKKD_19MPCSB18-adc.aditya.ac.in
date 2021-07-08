import java.util.*;
class array_left_right
{
public static void main(String args[])
{
int n,i,j,r,r1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
r=s.nextInt();
r1=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
for(i=0;i<n;i++)
a[i]=s.nextInt();
for(i=0;i<n;i++)
{
if((i-r)<0)
{
b[i]=a[n-(r-i)];
}
else
b[i]=a[i-r];   //right side
}

for(j=0;j<n;j++)
{
if((j-r1)<0)
{
c[n+j-r1]=b[j];   //left side
}
else
c[j-r1]=b[j];
}


for(j=0;j<n;j++)
{
System.out.print(c[j]+" ");
}
}
}


