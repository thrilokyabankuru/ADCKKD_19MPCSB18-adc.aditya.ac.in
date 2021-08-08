/*n:4
  m:20
Output--->90
Explanation
Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
Sum of numbers not divisible by 4 are 
1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150
Difference 150 – 60 = 90   */

import java.util.*;
class accenture
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int sum=0,sum1=0;
for(int i=1;i<=m;i++)
{
if(i%n==0)
sum=sum+i;
else
sum1=sum1+i;
}
System.out.println(Math.abs(sum-sum1));
}
}



