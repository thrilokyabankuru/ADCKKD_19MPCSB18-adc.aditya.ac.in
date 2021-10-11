//count the vowels in the given string using recursion

import java.util.*;
class vsr
{
public static void main(String args[])
{ 
Scanner s=new Scanner(System.in);    // eat
String str=s.next();
int count=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'
|| str.charAt(i)=='A' ||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
count++;
}
System.out.println(count);
}
}