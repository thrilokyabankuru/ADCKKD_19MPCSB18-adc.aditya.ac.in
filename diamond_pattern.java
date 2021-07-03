import java.util.*;
class diamond_pattern
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int k=1;k<=n-i;k++)
System.out.print("   ");
for(int j=1;j<=(2*i)-1;j++)
System.out.print(" * ");
System.out.println("  ");
}
for(int a=n-1;a>0;a--)
{
for(int b=1;b<=n-a;b++)
System.out.print("   ");
for(int c=1;c<=(2*a)-1;c++)
System.out.print(" * ");
System.out.println("  ");
}
}
}
