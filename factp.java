/*Develop factorial logic using prefix. Print factorial of n for Q queries.
Example:
3 --- no.of queries
5   --- n value
120  --- output
8
40320
4
24   */

import java.util.*;
class factp
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int Q=s.nextInt();
int p[]=new int[100000];
p[0]=1;
while(Q>0)
{
int n=s.nextInt();
for(int i=1;i<=n;i++)
p[i]=p[i-1]*i;
System.out.println(p[n]);
Q--;
}
}
}
