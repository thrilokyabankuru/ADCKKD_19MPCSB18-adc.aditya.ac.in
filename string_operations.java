//Sample Input:
//Aditya Degree College
//Output:
//6+6+7=19

import java.util.*;
class string_operations
{
public static void main(String args[])
{
int sum=0;
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter string:");
str=sc.nextLine();
String ch[]=str.split(" ");
int n=ch.length; 
if(n==0)
System.out.print(n);
else
{
for(int i=0;i<n;i++)
{
String st=ch[i]; //aditya degree college
int m=st.length();
sum=sum+m;
}
System.out.print(sum);
}
}
}