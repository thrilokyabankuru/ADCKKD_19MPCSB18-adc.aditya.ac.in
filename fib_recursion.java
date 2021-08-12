import java.util.*;
class Solution 
{
    public int fib(int n) 
    {
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        else
            return fib(n-1)+fib(n-2);
        
    }
}
class fib_recursion
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Solution x=new Solution();
System.out.println(x.fib(s.nextInt()));
}
}