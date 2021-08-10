import java.util.*;
class shellsort
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
int temp=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++) 
{ 
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.print(a[i]+" ");
}
}
}