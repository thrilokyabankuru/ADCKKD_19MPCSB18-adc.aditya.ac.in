import java.util.*;
class alpha_pattern
{
public static void main(String args[])
{
int n,k=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
char ch='A'; 
for(int i=0;i<n;i++)
{
for(int j=i+1;j>k;j--)
{
System.out.print(ch+" ");
ch+=1;
}
System.out.println();
}
}
}

