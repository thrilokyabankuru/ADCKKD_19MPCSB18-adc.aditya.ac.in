import java.util.*;
class mfd
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i,max=0,k=0;
for(i=0;i<n;i++)
a[i]=s.nextInt();
int b[] = new int[10];
for(i=0;i<n;i++)
{
while(a[i]>0)
{
b[a[i]%10]++;
a[i]/=10;
}
}
for(i=0;i<10;i++)
{
if(b[i]>=max)
{
max=b[i];
k=i;
}
}
System.out.println(k);
}
}