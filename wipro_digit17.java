/* initialize a character variable in a program and print "alphabet" if the initialized 
   value is an alphabet and print "digit" if the initialized value is a number and print 
   "special character" , if the initialized value is anything else   */

import java.util.*;
class wipro_digit17
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    char char1 =s.next().charAt(0);
    if(char1>=48 && char1<=57)
    {
        System.out.print("It is a Digit");

    }
    else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
    {
        System.out.print("It is an Alphabet");
    }
    else
        System.out.print("It is a special character");

    }
}

