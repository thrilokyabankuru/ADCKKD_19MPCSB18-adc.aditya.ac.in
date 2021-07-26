import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int zeroes = 0;
int repetitions = (int) (Math.log(n) / Math.log(5));
for(int i = 1; i <= repetitions; i++)
{
zeroes += n / Math.pow(5, i);
}
System.out.println(zeroes);
}
}