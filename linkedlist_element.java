import java.util.*;
class linkedlist_element
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
LinkedList<Integer> x=new LinkedList<Integer>();
System.out.println("Enter n value");
n=s.nextInt(); 
for(int i=0;i<n;i++)
{
x.add(s.nextInt());
}
System.out.println("Enter value to search");
int r=s.nextInt();
if(x.contains(r))
{
System.out.println("list after deletion");
int v=x.indexOf(r);  
x.remove(v);
for(Integer i:x)
System.out.print(i+" ");
}
else
System.out.println("element not found");
}
}

