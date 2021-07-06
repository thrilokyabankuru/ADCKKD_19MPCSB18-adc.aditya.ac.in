import java.util.*;
class sub_arrays
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println(" Enter values into array ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int sum=0,j=0,sum1=0;
for(int i=j;i<n/2;i++)  // 1 2 3 4
{
sum+=a[i];
j++;
}
for(int k=j;k<n;k++)
{
sum1+=a[k];
}
System.out.print(sum*sum1);
}
}
