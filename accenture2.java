/*    input:sum:9
      Arr:5 2 4 3 9 7 1
      Output-->2
      Explanation
      Pair of least two element is 
      (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2  */
import java.util.*;
class accenture2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum1=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt(); 
int sum=s.nextInt();                         // 1 2 3 4 5 7 9
Arrays.sort(a);
sum1=a[0]+a[1];
if(sum1<sum)
System.out.println(a[0]*a[1]);
else
System.out.println("0");
}
}



