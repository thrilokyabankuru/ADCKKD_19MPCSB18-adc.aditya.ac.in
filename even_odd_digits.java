//Program to print no.of. even digits & odd digits for a given number n
import java.util.*;
class even_odd_digits
{
public static void main(String args[])
{
int n,rem,count=0,flag=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
rem=n%10;
if(rem%2==0)
count+=1;
else
flag+=1;
n=n/10;
}
System.out.println("odd digits = "+ flag);
System.out.println("even digits = "+ count);
}
}


