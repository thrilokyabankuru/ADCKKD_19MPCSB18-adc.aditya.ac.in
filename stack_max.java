import java.util.*;
class stack_max
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Stack st = new Stack<>();
for(int i=0;i<n;i++)
{
st.push(s.nextInt());
}
System.out.println("Maximum Value : "+Collections.max(st));
System.out.println("Minimum Value : "+Collections.min(st));
}
}
