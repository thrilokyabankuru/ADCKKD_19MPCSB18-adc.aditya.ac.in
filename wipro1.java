/*input-- 9
       10 20 20 10 10 30 50 10 20
Sample Output---3
Explanation
            pairs---10-10, 10-10, 20-20
         nonpairs---50, 60, 20  */
import java.util.*;
class wipro1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)  // 10 10 10 10 20 20 20 30 50
a[i]=s.nextInt();
Arrays.sort(a); 
int count=1,flag=0,k=1;  
for(int j=k;j<n;j++)
{
if(a[j-1]==a[j])
{
count+=1;
k=j;
}
else
count=1;
if(count%2==0)
flag+=1;
}

System.out.println(flag);
}
}

