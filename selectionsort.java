import java.util.*;
class selectionsort
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
int min=i;
for(int j=i+1;j<n;j++)
{
if(a[min]>a[j])
min=j;
}
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}
