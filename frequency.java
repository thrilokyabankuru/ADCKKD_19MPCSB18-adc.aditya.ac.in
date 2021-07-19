import java.util.*;
class frequency
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int k=0;k<n;k++)
{
arr[k]=s.nextInt();
}
HashMap<Integer,Integer> h =new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
if(h.containsKey(arr[i]))   //{​​​4, 4, 5, 5, 6}​​​
h.put(arr[i],h.get(arr[i])+1);
else
h.put(arr[i],1);
}
for(Map.Entry<Integer, Integer> j : h.entrySet())
{
if(j.getValue()>1)
System.out.println(j.getKey() + "---->" + j.getValue());
}
}
}

