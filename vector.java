






import java.util.*;
class vector
{
public static void main(String args[])
{
Vector v=new Vector();
v.add(101);
v.add("Rama");
v.add(6.58);
v.add(102);
v.add("Sita");
v.add(8.98);
System.out.println(v);
v.remove("Sita");
for(int j=0;j<v.size();j++)
System.out.print(v.get(j)+" ");
System.out.println();
if(v.contains(6.58))
{
int r=v.indexOf(6.58);
v.set(r,9.77);
for(int k=0;k<v.size();k++)
System.out.print(v.get(k)+" ");
}
System.out.println();
if(v.contains("Ram")==false)
System.out.println("false");
}
}