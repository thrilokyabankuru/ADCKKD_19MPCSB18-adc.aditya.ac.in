//WRITE A PROGRAM TO CONVERT A DECIMAL NUMBER IN OCTAL,HEXA AND BINARY USING SWITH CASE
//Ex: 1
//Input: 1. decimal to binary
//2.decimal to octal
//3. decimal to hexal
//Enter your choice : 2
//Enter decimal value: 12
//Output:
//octal: 14

import java.util.*;
class conversions_case
{
public static void main(String args[])
{
int n,ch;
Scanner s=new Scanner(System.in);
System.out.println("Enter your choice : ");
ch=s.nextInt();
switch(ch)
{
case 1:System.out.print("Enter a decimal num:");
       n=s.nextInt();
       String b=Integer.toBinaryString(n);
       System.out.println("Binary value:"+b);
       break;
case 2:System.out.print("Enter a decimal num:");     
       n=s.nextInt();
       String o=Integer.toOctalString(n);
       System.out.println("Octalvalue:"+o);
       break;
case 3:System.out.print("Enter a decimal num:");     
       n=s.nextInt();
       String h=Integer.toHexString(n);
       System.out.println("Hexal value:"+h);
       break;
default:System.out.println("Invalid choice");
}
}
}





