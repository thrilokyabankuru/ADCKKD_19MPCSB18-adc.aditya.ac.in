/*Write a java program to print 1 to 50 multiples of 5 using indirect recursion.
Hint: Take n=0, N=50 and increment 5
Example:
Output:
5 10 15 20  25  30  35  40 45  50 */

import java.util.*;
class indirect2
{
Scanner s=new Scanner(System.in);
static int n=0;
static int N=50;
int i=0;
public static void f1()
{
if(n<N)
{
n=n+5;
System.out.print(n+" ");
f2();
}
}
public static void f2()
{
if(n<N)
{
n+=5;
System.out.print(n+" ");
f1();
}
}

public static void main(String args[])
{
f1();
}
}


