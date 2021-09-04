import java.util.*;
class wipro_array14
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[3][3];
int n=a.length;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("array in 2d");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");    
}
System.out.println();
}
int max=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i][j]>max)    
max=a[i][j];
}
}
System.out.print("the biggest element int the given array is "+max);
}
}