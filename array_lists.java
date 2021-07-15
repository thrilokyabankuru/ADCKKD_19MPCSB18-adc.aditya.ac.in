//Write a Java program to join two array lists and print in sorted order
//Example1:
//Input:
//Enter First Array: 10 20 30 40
//Enter Second Array: 100,200,300,400
//Ouput:
//Final List:
//10,20,30,40,100,200,300,400

import java.util.*;
class array_lists
{
public static void main(String args[])
{
ArrayList<String> a=new ArrayList<String>();
ArrayList<String> a1=new ArrayList<String>();
a.add("Aditya"); 
a.add("Ram"); 
a.add("Kumari"); 
a.add("Bhavani"); 
a1.add("Thrilokya");
a1.add("Tirupathi");
a1.add("Pavani");
a1.add("Balu");
a.addAll(a1);
Collections.sort(a);
System.out.println(a);
}
}


