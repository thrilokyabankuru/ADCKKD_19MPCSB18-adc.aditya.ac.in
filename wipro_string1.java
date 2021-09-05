// to check given string is palindrome or not

import java.util.*;
class wipro_string1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);   // mom
String str=s.next();
char ch[]=new char[str.length()];
int j=0;
for(int i=str.length()-1;i>=0;i--)
{
ch[j]=str.charAt(i);
j++;
}
String str1 = String.valueOf(ch);
if(str.equals(str1))
System.out.println("given string is palindrome");
else
System.out.println("given string is not palindrome");
}
}
