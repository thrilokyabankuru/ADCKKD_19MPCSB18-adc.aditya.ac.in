import java.util.*;
class Myanagram
{
public static void main(String args[])
{
String s1,s2;
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st string:");
s1=sc.next();
System.out.print("Enter 2nd string:");
s2=sc.next();
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
if(Arrays.equals(ch1,ch2))
System.out.print("Anagram");
else
System.out.print(" Not a Anagram");
}
}