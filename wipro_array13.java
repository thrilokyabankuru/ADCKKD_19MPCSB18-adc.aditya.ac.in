/* reverse the elements of a given 2*2 array four integer nmbr to be passed at run time
ex--1 2 3 4
          the given array  1   2     reverse of the array 4  3
                           3   4                          2  1  */

import java.util.*;
class wipro_array13
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[2][2];
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
System.out.println("array in reverse");
for(int i=n-1;i>=0;i--)
{
for(int j=n-1;j>=0;j--)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

}
}






                         