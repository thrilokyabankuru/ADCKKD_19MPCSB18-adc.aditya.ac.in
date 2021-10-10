//Calculating the power any number using recursion 

import java.util.*;
class pr1
{
int pro=1;
int power(int a,int p)   // 2 ,3
{
if(p==1)
return 1;
else
{
pro=pro*a;
power(a,p-1);
return pro*a;
}
}
}
class pr
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int nmbr=s.nextInt();
int power=s.nextInt();
pr1 x=new pr1();
System.out.println(x.power(nmbr,power));
}
}
