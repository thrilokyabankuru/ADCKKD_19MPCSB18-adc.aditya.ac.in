//Find out the factorial value of given number using recursion

import java.util.*;
class fact1
{
int factorial(int a) // 10
{
if(a==1)
return 1;
else
return a*factorial(a-1);
}
}
class fct
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
fact1 x=new fact1();
System.out.println(x.factorial(n));
}
}

