import java.util.*;
class array_min_max
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println(" Enter values into array ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
 int min,max;
min=max=a[0];
for(int i=1;i<n;i++)
{
if(min>a[i])
min=a[i];
if(max<a[i])
max=a[i];
}
System.out.println("Minimum value is " + min);
System.out.println("Maximum value is " +max);
}
}