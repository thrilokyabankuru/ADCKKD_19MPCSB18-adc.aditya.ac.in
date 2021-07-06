import java.util.*;
class test6
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
n=s.nextInt();  
int a[]=new int[n];
System.out.println(" Enter values into array");
for(i=0;i<n;i++)
a[i]=s.nextInt();
int k=1;
for(i=0;i<n;i++)
{
for(int j=k;j<n;j++)
{
if(a[i]==a[j])
System.out.print(a[i]);
}
k+=1;
}
}
}