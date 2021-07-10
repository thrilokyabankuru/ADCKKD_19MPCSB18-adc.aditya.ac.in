//PROGRAM TO PRINT STRING ODD WISE AND EVEN WISE
//Ex1:
//Input:123456
//Output 13 246
//Ex2:
//Input: 786234
//output: 73 8624

import java.util.*;
class Strodd_even
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
str=s.next();
char ch[]=str.toCharArray();
int n=ch.length;
for(int i=0;i<n;i++)
{
if(ch[i]%2==1)                
System.out.print(ch[i]);
}
System.out.print(" ");
for(int i=0;i<n;i++)
{
if(ch[i]%2==0)                              
System.out.print(ch[i]);
}
}
}


                

