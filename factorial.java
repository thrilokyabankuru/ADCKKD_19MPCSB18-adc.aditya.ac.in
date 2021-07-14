//factorial of a given number using recursive function
import java.util.*;
class factorial
{
int factorial2(int p)
{
if(p==0)
return 1;
else
return p*(factorial2(p-1));
}
}
class factorial1
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
factorial f=new factorial();
System.out.print(f.factorial2(n));
}
}
 