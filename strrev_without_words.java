//2. Given a String S, reverse the string without reversing its individual words. 
//Words are separated by dots.
//Ex:1
//Input: i.like.this.program.very.much
//Output: much.very.program.this.like.i
//Explanation: reversing the whole string(not individual words)
//Ex:2
//Input: sun.rises.in.the.east
//Output: east.the.in.rises.sun

import java.util.*;
class strrev_without_words
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter string data:");
str=sc.nextLine();
String ch[]=str.split(" ");         //sun.rises.in.the.east
int n=ch.length;
if(n==0)
System.out.print(n);
else
{
for(int i=n-1;i>=0;i--)
{
String st=ch[i];
int m=st.length();
for(int j=0;j<m;j++)
System.out.print(st.charAt(j));
if(i!=0)
System.out.print(".");           
}
}
}
}


