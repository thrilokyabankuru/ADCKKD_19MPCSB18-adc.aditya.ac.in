import java.util.*;
class amazon
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int M=s.nextInt();
if(n%2==0)
System.out.println(n/2*M);
else
System.out.println(((n/2)+1)*M);
}
}