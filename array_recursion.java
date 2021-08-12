//write a program to print array elements using recursion without loop
import java.util.*;
class array
{
public void elements(int i,int a[])
{
if(i==a.length)   // 10 20 30 40
return;
else
{
System.out.print(a[i]+" ");
elements(i+1,a);
}
}
}
class array_recursion
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int b[]=new int[n];
for(int i=0;i<n;i++)
b[i]=s.nextInt();
array x=new array();
x.elements(0,b);
}
}

