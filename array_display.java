// Find out odd no's in array and display in ascending order
import java.util.*;
class array_display
{
public static void main(String args[])
{
int n,temp,k=0,j=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)   
{
if(a[i]%2!=0)
{
b[j]=a[i];
Arrays.sort(b);
}
}
for(int i=0;i<b.length;i++)   
{ 
if(b[i]!=0)
{
System.out.print(b[i]);
}
}
}
}
