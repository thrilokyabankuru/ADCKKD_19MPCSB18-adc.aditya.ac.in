/* write a program that will concatenate 2 strings and return the result.The result should be 
   in the lower case
  if the concatenation creates a double-char,then one of the characters need to be ommitted
ex1: I/P:Sachin,Tendulkar
     O/P:sachin tendulkar
ex2: I/P:Mark,kate
     O/P:markate                 */
import java.util.*;
class wipro_string2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
StringBuilder str=new StringBuilder(str1);
char ch1=str1.charAt(str1.length()-1);
char ch2=str2.charAt(0);
if(ch1==ch2)
{
str.deleteCharAt(str1.length()-1);
String h=str.toString();
System.out.println(h.toLowerCase()+str2);
}
else
System.out.println(str1.toLowerCase()+" "+str2.toLowerCase());
}
}