//Input: chars = ["a","a","b","b","c","c","c"]
//Output: Return 6, and the first 6 characters of the input array
//should be: ["a","2","b","2","c","3"]
//Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

import java.util.*;
class Strcompress
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char[] ch = s.next().toCharArray();
int count=1,i=0;
while(i<ch.length)
{
for(int j=i+1;j<ch.length;j++)
{
if(ch[i]==ch[j])                
count+=1;
}
if(i==0)
System.out.print("[");
if(count==1 && i==ch.length-1)
{
System.out.print("\""+ch[i]+"\"");
break;
}
if(count>1)
{
System.out.print("\""+ch[i]+"\""+",");
System.out.print("\""+count+"\"");
i+=count;
if(i!=ch.length)                                     
System.out.print(",");
}
count=1;
}
System.out.print("]");
}
}




