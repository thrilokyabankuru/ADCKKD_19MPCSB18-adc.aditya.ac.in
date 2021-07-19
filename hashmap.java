

import java.util.*;
class hashmap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
HashMap<Integer,String> h=new HashMap<Integer,String>();
int n=s.nextInt();
for(int i=0;i<n;i++)
{
int key=s.nextInt();
String value=s.next();
h.put(key,value);
}
TreeMap<Integer,String> t=new TreeMap<Integer,String>(h);
for (Map.Entry<Integer, String> j : t.entrySet())
{
System.out.println(j.getKey() + " " + j.getValue());
}
}
}





