import java.util.*;
class big16
{
public static void main(String args[])
{
int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
d=s.nextInt();
e=s.nextInt();
f=s.nextInt();
g=s.nextInt();
h=s.nextInt();
i=s.nextInt();
j=s.nextInt();
k=s.nextInt();
l=s.nextInt();
m=s.nextInt();
n=s.nextInt();
o=s.nextInt();
p=s.nextInt();
int b1=(int)Math.max(Math.max(a,b),Math.max(c,d));
int b2=(int)Math.max(Math.max(e,f),Math.max(g,h));
int b3=(int)Math.max(Math.max(i,j),Math.max(k,l));
int b4=(int)Math.max(Math.max(m,n),Math.max(o,p));
int b5=(int)Math.max(Math.max(b1,b2),Math.max(b3,b4));
System.out.println(b5);
}
}





