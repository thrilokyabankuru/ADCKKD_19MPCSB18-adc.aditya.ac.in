import java.util.*;
class Solution 
{
int rem=0,sum=0;
    public int ispalin(int n) 
    {

        if(n==0)
            return sum;
        else
         { 
           rem=n%10;
           sum=10*sum+rem;
           ispalin(n/10);
         }
return sum;
    }
}
class palindrome_recursion
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Solution x=new Solution();
int a=s.nextInt();
int y=x.ispalin(a);
if(a==y)
System.out.println("yes "+a+" is a palindrome");
else
System.out.println("no "+a+" is not a palindrome");
}
}