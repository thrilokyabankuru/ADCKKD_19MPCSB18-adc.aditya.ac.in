//write a program to print given string is palindrome or not

import java.util.*;
class strpalindrome
{
public static void main(String args[])
{
String str;
int j=0,count=0,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter String Data:");
str=sc.nextLine();
char ch[]=str.toCharArray();
int n=ch.length;
char ch1[]=new char[n];
for(i=n-1;i>=0;i--)
{
ch1[j]=ch[i];
j+=1;
}
for(i=0;i<n;i++)
{
if(ch[i]==ch1[i])
count+=1;
}
if(count==n)
System.out.println("palindrome");
else
System.out.println("Not palindrome");
}
}
