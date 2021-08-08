/* input--->arr:3 2 1 7 5 4
Output---->7
Explanation
Second largest among even position elements(1 3 5) is 3
Second largest among odd position element is 4
Thus output is 3+4 = 7 */

import java.util.*;
class accenture1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n/2+1];
int c[]=new int[n/2+1];
int y=b.length;
int q=c.length;
int min=a[0];
int max=0,j=0,k=0;
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=0;i<n;i++)
{                                      // 1 8 0 2 3 5 6
if(i%2==0)
{
b[j]=a[i];
j++;
}
else
{
c[k]=a[i];
k++;
}
}
Arrays.sort(b);
Arrays.sort(c);
System.out.println(b[y-2]+c[q-2]);
}
}




