import java.util.*;
class digits
{
public static void main(String args[])
{
int n,rem,sum=0,product=1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
rem=n%10;
product=product*rem;
sum=sum+rem;
n=n/10;
}
System.out.println("Result = "+(product-sum));
}
}