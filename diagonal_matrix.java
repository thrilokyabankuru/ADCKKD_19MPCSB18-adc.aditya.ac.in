import java.util.*;
class diagnol_matrix
{
public static void main(String args[])
{
int n1,n2,i,j,count=0,flag=0;
Scanner s=new Scanner(System.in);
n1=s.nextInt();
n2=s.nextInt();
int a[][]=new int[n1][n2];
if(n1==n2)
{
for(i=0;i<n1;i++)
{
for(j=0;j<n2;j++)
a[i][j]=s.nextInt();
}
for(i=0;i<n1;i++)
{
for(j=0;j<n2;j++)
{
if(i==j && a[i][j]!=0)
count+=1;
if(i!=j && a[i][j]==0)
flag+=1;
}
}
}
else
{
System.out.print("not square matrix so");
}
if(count==n1 && flag==(n1*(n1-1)))
{
System.out.print("diagnol matrix");
}
else 
System.out.print("it is not diagnol matrix");
}
}






















































