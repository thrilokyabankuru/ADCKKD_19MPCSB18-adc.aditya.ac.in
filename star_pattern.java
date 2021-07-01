import java.util.*;
class star_pattern
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}

