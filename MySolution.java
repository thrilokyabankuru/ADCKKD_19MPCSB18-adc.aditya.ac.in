import java.util.*;
public class MySolution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i;                                   //1 2 3 4 5
int n=sc.nextInt();
int r=sc.nextInt();
int ar[]=new int[n];
int br[]=new int[n];
for(i=0;i<n;i++)
ar[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if((i-r)<0)
{
br[n+i-r]=ar[i];
}
else
br[i-r]=ar[i];
}
for(i=0;i<n;i++)
System.out.print(br[i]+" ");
}
}