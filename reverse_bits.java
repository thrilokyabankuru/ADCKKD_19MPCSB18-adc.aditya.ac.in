import java.util.*;
class reverse_bits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
str=sc.next();
StringBuilder sb=new StringBuilder(str);
sb.reverse();
long d=Long.parseLong(sb.toString(),2);
System.out.print(d+" "); 
System.out.print("(");
System.out.print(sb.toString());
System.out.print(")");
}
}