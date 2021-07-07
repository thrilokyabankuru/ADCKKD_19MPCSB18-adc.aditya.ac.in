import java.util.*;
public class MySolution1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i;                                  
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
br[i]=ar[n-(r-i)];
}
else
br[i]=ar[i-r];
}
for(i=0;i<n;i++)
System.out.print(br[i]+" ");
}
}