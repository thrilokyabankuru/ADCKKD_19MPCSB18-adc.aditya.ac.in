//PROGRAM TO REVERSE EACH WORD OF THE GIVEN STRING.
//Ex1:
//Input: hello world
//Output: olleh dlrow
//Ex2:
//Input: sun rises in the east
//Ouput: nus sesir ni eht tsae

import java.util.*;
class Strrev
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
System.out.print("Enter string data:");
str=s.nextLine();
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
ch2[j]=ch1[m-j-1];         //aditya degree college
System.out.print(ch2[j]);
}
System.out.print(" ");
}
}
}
}





