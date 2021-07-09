//count the number of symbols,letters,digits and 
//if they are equal print "yes" otherwise print "no"

import java.util.*;
class Strprogram1_count
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter string:");
str=sc.next();
int l=0,d=0,s=0;
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(Character.isUpperCase(ch[i]) || Character.isLowerCase(ch[i]))
l++;
else if(Character.isDigit(ch[i]))
d++;
else
s++;
}
if(l==d && d==s && s==l)
System.out.println("Yes");
else
System.out.println("No");
}
}
