import java.io.*;
import java.util.*;


public class hcfOf_N{
 static   int gcd(int a,int b)
{
if(a==0)
return b;
else 
return gcd(b%a,a);

}


static int gcd1(int d,int c)
{
if(d==0)
return c;
else 
return gcd1(c%d,d);

} 

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       
        //hcf x=new hcf();
        int a1=s.nextInt();
         if(n==1)
            System.out.println(a1);
        else
        {
        int b1=s.nextInt();
        int c1=s.nextInt();
        int d1=gcd(a1,b1);
        int res=gcd1(d1,c1);
        System.out.println(res);
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}