import java.util.*;
class star_pattern1
{
public static void main(String args[])
{
int n,k=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i+1;j>k;j--)
System.out.print("* ");
System.out.println();
}
for(int i=1;i<n;i++)
{
for(int j=i;j<n;j++)
System.out.print("* ");
System.out.println();
}
}
}

