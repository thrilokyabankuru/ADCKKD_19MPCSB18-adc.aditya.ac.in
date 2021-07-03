import java.util.*;
class pattern1
{
public static void main(String args[])
{
int n,start=0,end,i,j;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int size=2*n-1;
char[][] a=new char[size][size];
char c='A'; 
end=size-1;
while(n!=0)
{
for(i=start;i<=end;i++)
{
for(j=start;j<=end;j++)
{
if(i==start || i==end || j==start || j==end )
a[i][j]=c;
}
}
n--;
c++;
start++;
end--;
}
for(i=0;i<size;i++)
{
for(j=0;j<size;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}

