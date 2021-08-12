import java.util.*;
class mergesort
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int m=s.nextInt();
int b[]=new int[m];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=0;i<m;i++)
b[i]=s.nextInt();
int c[]=new int[n+m];   // 2 4 6 8    1 3 5 7
int i=0,j=0,k=0;
while(i<n && j<m)
{
if(a[i]<b[j])
{
c[k]=a[i];
k++; i++;
}
else 
{
c[k]=b[j];
k++; j++;
}
}
while(i<n)
{
c[k]=a[i];
k++; i++;
}
while(j<m)
{
c[k]=b[j];
k++; j++;
}
for(int r=0;r<c.length;r++)
System.out.print(c[r]+" ");
}
}

