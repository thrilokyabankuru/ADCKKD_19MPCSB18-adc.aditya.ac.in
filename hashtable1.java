

import java.util.*;
class hashtable1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
h1.put(101,50000);
h1.put(102,45000);
h1.put(103,35000);
h1.put(104,40000);
h1.put(105,55000);
h1.put(106,60000);
TreeMap<Integer,Integer> h=new TreeMap<Integer,Integer>(h1);
System.out.println(h);
System.out.println("Enter Key Value");
int K=s.nextInt();
if(h.containsKey(K))
{
int b=s.nextInt();
System.out.print("{");
for (Map.Entry<Integer,Integer> r : h.entrySet())         
{
if(K==r.getKey())
System.out.print(r.getKey() + "=" + (r.getValue()+b));
else
System.out.print(r.getKey() + "=" + r.getValue());
if(r.getKey()!=106)
System.out.print(","+" ");
}
System.out.print("}");
}
else
System.out.print("Value not found");




}
}



