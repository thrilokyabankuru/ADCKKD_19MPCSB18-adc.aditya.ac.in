import java.util.*;
class Geeks {
static void bitWiseOperation(int a, int b, int c) {
int d,e,f,g;
d=a^a;
System.out.println(d);
e=c^b;
System.out.println(e);
f=a&b;
System.out.println(f);
g=c|(a^a);
System.out.println(g);
System.out.println(~e);
}
}
class bits
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Geeks x=new Geeks();
x.bitWiseOperation(s.nextInt(),s.nextInt(),s.nextInt());
}
}