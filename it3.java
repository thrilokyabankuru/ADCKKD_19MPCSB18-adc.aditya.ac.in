


import java.util.*;
public class it3{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
ArrayList<Integer> h1=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
h1.add(s.nextInt());
}
int Q=s.nextInt();
Iterator<Integer> z=h1.iterator();
while(z.hasNext())                          // 30 40 15 20 25 7 99
{
int x=z.next();
if(x<=Q)
z.remove();
else                                
System.out.print(x+" ");
}
}
}