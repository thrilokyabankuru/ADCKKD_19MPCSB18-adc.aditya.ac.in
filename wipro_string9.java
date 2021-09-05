/* I/P:Hello,World
   O/P:HWeolrllod    
any characters  left ,go to the end of the result   */

import java.util.*;
class wipro_string9
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
int a=str1.length();
int b=str2.length();
if(a==b)
{
for(int i=0;i<str1.length();i++)
{
System.out.print(str1.charAt(i));
System.out.print(str2.charAt(i));
}
}
else if(a>b)   
{
for(int i=0;i<str2.length();i++)
{
System.out.print(str1.charAt(i));
System.out.print(str2.charAt(i));
}
for(int i=str2.length();i<str1.length();i++)
System.out.print(str1.charAt(i));
}
else if(a<b)   
{
for(int i=0;i<str1.length();i++)
{
System.out.print(str1.charAt(i));
System.out.print(str2.charAt(i));
}
for(int i=str1.length();i<str2.length();i++)   // hot  aditya   haodtitya
System.out.print(str2.charAt(i));
}
}
}
