import java.util.*;
class nmbr_pattern
{
public static void main(String args[])
{
int n,k=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}

