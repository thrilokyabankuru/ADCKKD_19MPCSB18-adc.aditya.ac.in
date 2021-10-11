import java.util.*;
class vsr1
{
int count=0;
int vowel(String str)
{
StringBuilder str1=new StringBuilder(str);
if(str1.length()==0)   //eat
return 0;
else
{
if(str1.charAt(str1.length()-1)=='a' || str1.charAt(str.length()-1)=='e'||str1.charAt(str.length()-1)=='i'||str1.charAt(str1.length()-1)=='o'||str1.charAt(str1.length()-1)=='u')
count=count+1;
str1.deleteCharAt(str1.length()-1);
vowel(str1.toString());
return count;
}
}
}
class vsrr
{
public static void main(String args[])
{ 
Scanner s=new Scanner(System.in);    // eat
String str=s.next();
vsr1 x=new vsr1();
System.out.println(x.vowel(str));
}
}
