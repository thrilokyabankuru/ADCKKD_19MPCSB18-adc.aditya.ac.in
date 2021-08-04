import java.util.*;
class Zerotolast
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter array size:");
int n=sc.nextInt();
int ar[]=new int[n];
int i,j,k;
System.out.print("Enter array elements:");
for(i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
j=0;
for(i=0;i<n;i++)
{
if(ar[i]!=0)
{
ar[j]=ar[i];
j++;
}
}

for(i=j;i<n;i++)
ar[i]=0;

for(i=0;i<n;i++)
{
System.out.print(" "+ar[i]);
}
}
}