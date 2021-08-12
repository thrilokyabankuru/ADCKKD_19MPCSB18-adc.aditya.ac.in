import java.util.*;
class insertionsort_des
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=1;i<n;i++)   // 10 4 6 5 2
{
int key=a[i];
int j=i-1;
while(j>=0 && a[j]<key)
{
a[j+1]=a[j];
j=j-1;
}
a[j+1]=key;
}
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}
