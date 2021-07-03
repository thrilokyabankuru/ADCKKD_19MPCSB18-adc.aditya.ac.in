import java.lang.Math;
import java.util.*;
class automorphic
{
public static void main(String args[])
{
int rem,n,a,s1,r;
int count=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
r=n;
a=n*n;
while(n>0)
{
rem=n%10;
count+=1;
n=n/10;
}
s1=(int)Math.pow(10,count);
if(a%s1==r)
System.out.println("Automorphic number");
else
System.out.println("Not an Automorphic number");
}
}

