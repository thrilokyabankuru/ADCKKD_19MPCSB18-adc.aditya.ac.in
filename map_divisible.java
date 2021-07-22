
import java.util.*;
class map_divisible
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
int n=s.nextInt();
int t=s.nextInt();
int f=s.nextInt();
int count=0,flag=0;
int keys[]=new int[n];
for(int i=0;i<n;i++)
{
h1.put(s.nextInt(),keys[i]);
}
for (Map.Entry<Integer,Integer> j : h1.entrySet())
{
if(j.getKey()%t==0)    //{12,21,10,20,9,3,6,7,8,11}             
count+=1;                              
if(j.getKey()%f==0)
flag+=1;
}
System.out.println(t+ " = "+count);  
System.out.println(f+ " = "+flag);
}
}

