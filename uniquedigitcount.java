import java.util.*;
class uniquedigitcount
{
public static void main(String args[])
{
HashSet<Integer> x=new HashSet<Integer>();
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n>0)
{
x.add(n%10);
n=n/10;
}
System.out.println(x.size());
}
}