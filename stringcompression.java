import java.util.*;
class stringcompression
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String S=s.next();  // aaabbcc
StringBuffer output=new StringBuffer();
char last=S.charAt(0);
int count=1;
for(int i=1;i<S.length();i++)
{
if(S.charAt(i)==last)
count++;
else
{
if(count>1)
output.append(""+last+count);
else
output.append(last);
count=1;
last=S.charAt(i);
}
}
if(count>1)
output.append(""+last+count);
else
output.append(last);
System.out.println(output.toString());
}
}