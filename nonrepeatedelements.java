import java.util.*;
class nonrepeatedelements
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int count=0;
int a[]=new int[10];
while(n>0)
{
a[n%10]=a[n%10]+1;
n=n/10;
}
for(int i=0;i<10;i++)
{
if(a[i]==1)
count+=1;
}

System.out.println(count);
}
}
