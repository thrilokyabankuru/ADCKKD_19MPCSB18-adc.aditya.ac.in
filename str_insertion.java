//Inserting the one string in the particular position of another data.
//Ex:1
//Input: Very Good
//new string: hi
//position:2
//Output: Vhiery Ghiood

import java.util.*;
class str_insertion
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter String:");
String str=s.nextLine();
String ch[]=str.split(" ");
System.out.println("Enter Inserting String:");
String ins=s.next();
System.out.println("Enter position of the String:");
int n=s.nextInt();
StringBuffer sb=new StringBuffer(str);
int n1=ch.length;
if(n1==0)
System.out.print(n1);
else
{
for(int i=0;i<n1;i++)
{
StringBuffer st=new StringBuffer(ch[i]);  //aditya degree        
st.insert(n,ins);         
System.out.print(st.toString());
System.out.print(" ");
}
}
}
}



