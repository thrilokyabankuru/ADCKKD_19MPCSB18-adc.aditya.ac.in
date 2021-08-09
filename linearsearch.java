import java.util.*;
class linear_search
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
int key=s.nextInt();
int flag=0;
for(int i=0;i<n;i++)
{
if(key==a[i])
{
flag=1;
break;
}
else
flag=0;
}
if(flag==1)
System.out.println("element found");
else
System.out.println("element not found");
}
}
