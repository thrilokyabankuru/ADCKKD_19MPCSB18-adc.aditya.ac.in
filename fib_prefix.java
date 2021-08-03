import java.util.*;
class fibbanocci
{
static long nthFibonacci(long n)
{
int num=(int)n;
long a[]=new long[num+1];
a[0]=0;
a[1]=1;
for(int i=2;i<num+1;i++)
{
a[i]=(a[i-1]+a[i-2])%1000000007;   
}
return a[num];
}
}
class fib_prefix
{
public static void main(String args[])
{
fibbanocci x=new fibbanocci();
Scanner s=new Scanner(System.in);
System.out.println(x.nthFibonacci(s.nextInt()));
}
}