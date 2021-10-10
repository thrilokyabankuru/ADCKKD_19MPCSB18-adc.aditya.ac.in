// Sum of natural numbers using recursion
import java.util.*;
class snr1
{
int sum=0;
int snar(int a)
{
if(a==0)
return 0;
else
return sum+a+snar(a-1);
}
}
class snr
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
snr1 x=new snr1();
System.out.println(x.snar(n));
}
}
