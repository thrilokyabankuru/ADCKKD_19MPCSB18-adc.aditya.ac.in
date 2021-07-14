import java.util.*;
import java.lang.*;
class Stroperations1
{
	public static void main(String args[])
	{
		StringBuffer s= new StringBuffer();
		Scanner in= new Scanner(System.in);
		System.out.println("Enter string:");
		s.append(in.nextLine());
		System.out.println("Enter no.of operations:");
		int q=in.nextInt();
		for(int i=1;i<=q;i++)
		{
			System.out.println("Enter the index and character to be replaced with:");
			int ind=in.nextInt();
			char ch=in.next().charAt(0);
			s.setCharAt(ind-1,ch);
		}
		StringBuffer str=new StringBuffer(s);
		System.out.println("Enter no.of operations to be performed on modified string:");
		int m=in.nextInt();
		for(int i=1;i<=m;i++)
		{
			System.out.println("Enter the indices to reverse substring:");
			int a=in.nextInt(),b=in.nextInt(),ans=0;
			StringBuffer upd=new StringBuffer();
			upd.append(s.substring(a-1,b));
			upd.reverse();
			s.replace(a-1,b,upd.toString());
		}
		int ans=0;
		System.out.println("First modified string:" + str);
		System.out.println("Second modified string:" + s);
		for(int i=0;i<s.length();i++)
		{
			if(str.charAt(i)==s.charAt(i))
				ans++;
		}
		System.out.println("No.of indices which have same characters:" + ans);
	}
}