/*  initialize 2 character variables in a program and display the characters 
    in alphabetical order   ex I/P: s,e 
                               O/P: e,s     */
import java.util.*;
class wipro_array16
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a='s';
char b='e';
if(a>b)
System.out.print(b+" "+a);
else
System.out.print(a+" "+b);
}
}