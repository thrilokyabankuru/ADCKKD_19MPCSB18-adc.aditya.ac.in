
import java.util.*;
class array_update
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
ArrayList<Integer> x=new ArrayList<Integer>();
System.out.println("Enter n value");
n=s.nextInt(); 
for(int i=0;i<n;i++)
{
x.add(s.nextInt());
}
System.out.println("Enter value in array");
int r=s.nextInt();
if(x.contains(r))
{
System.out.println("Enter value to be updated");
int u=s.nextInt();
int v=x.indexOf(r);   //10 20 30 40
x.remove(v);
x.add(v,u);
for(Integer i:x)
System.out.print(i+" ");
}
else
System.out.println("false");
}
}








