import java.util.*;
class minimum_value
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println(" Enter values into array ");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
int min;
min=a[0];
for(int i=1;i<n;i++)
{
if(min>a[i])
min=a[i];
}
System.out.println("Minimum value is " + min);
}
}
