
import java.util.*;
class palin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
StringBuffer st=new StringBuffer(str);
st.reverse();
String str1=st.toString();
if(str.equals(str1))
System.out.println("palindrome");
else
System.out.println("no palindome");
}
}
