import java.util.*;
class product_min_max
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the 1st array");
System.out.println("Enter size of the 2nd array");
int n1=sc.nextInt();
int n2=sc.nextInt();
int a[]=new int[n1];
int b[]=new int[n2];
System.out.println(" Enter values into 1st array ");
System.out.println(" Enter valuues into 2nd array ");
for(int i=0;i<n1;i++)
a[i]=sc.nextInt();
for(int j=0;j<n2;j++)
b[j]=sc.nextInt();
int max,min;
max=a[0];
min=b[0];
for(int i=1;i<n1;i++)
{
if(max<a[i])
max=a[i];
}
for(int j=1;j<n2;j++)
{
if(min>b[j])
min=b[j];
}
System.out.println("Product of Minimum and Maximum value is " + min*max);
}
}