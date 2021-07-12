//1.Write a program to convert every starting word of a letter is upper letter.
//Ex:1
//Input: this is coding class
//output:This Is Coding Class
//Ex2:
//Input: sun rises in the east
//Output: Sun Rises In The East

import java.util.*;
class strstarting_word
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter string data:");
str=sc.nextLine();
String ch[]=str.split(" ");
int n=ch.length;
if(n==0)
System.out.print(n);
else
{
for(int i=0;i<n;i++)
{
String st=ch[i];
int m=st.length();
char ch1[]=new char[m];
for(int u=0;u<m;u++)
{
ch1[u]=st.charAt(u);
}
char ch2[]=new char[m];
for(int j=0;j<m;j++)
{
if(j==0)
{
ch2[j]=Character.toUpperCase(ch1[j]);   
System.out.print(ch2[j]);
}
else
{
ch2[j]=ch1[j];
System.out.print(ch2[j]);
}
}
System.out.print(" ");
}
}
}
}

