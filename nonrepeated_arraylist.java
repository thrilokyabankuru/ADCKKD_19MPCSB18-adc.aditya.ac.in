import java.util.*;
class nonrepeated_arraylist
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int input1=s.nextInt();
int count=0,flag=0;
ArrayList<Integer> a= new ArrayList<Integer>();
ArrayList<Integer> a1=new ArrayList<Integer>();
while(input1>0)
		{
			a.add(input1%10);
			input1=input1/10;
		}
	    for(int i=0;i<a.size();i++)
		{
		if(a1.contains(a.get(i)))
		{
			count+=1;
		}
		else
		{
		a1.add(a.get(i));
		flag+=1;
		}
		}
		if(count==0)
		System.out.println(flag);
		else
	        System.out.println(flag-1);
               
}
}