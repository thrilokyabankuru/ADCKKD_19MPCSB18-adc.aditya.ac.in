//Program to print range of even(n to m) numbers in reverse order using while loop.
import java.util.*;
class even_reverse
{
public static void main(String args[])
{
int n,m;
Scanner s=new Scanner(System.in);
n=s.nextInt();
m=s.nextInt();
while(m>=n)
{
if(m%2==0)
System.out.print(m+" ");
m--;
}
}
}