//Program to check vowel or consonant using switch case
import java.util.*;
class vowel_consonant
{
public static void main(String args[])
{
char ch;
Scanner s=new Scanner(System.in);
ch=s.next().charAt(0);   
switch(ch)
{
case 'a' : 
case 'e' :
case 'i' :
case 'o' :
case 'u' :
case 'A' :
case 'E' :
case 'I' :
case 'O' :
case 'U' : System.out.println("vowel");
           break;
default :System.out.println("consonant");
}
}
}
