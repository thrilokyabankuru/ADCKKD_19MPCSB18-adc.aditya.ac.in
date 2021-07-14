import java.lang.*;
import java.util.*;
class StringMin {
	static int solve(String s){
          int i = 0, j = s.length() - 1;
          for (; i < j && s.charAt(i) == s.charAt(j);) {
            char d = s.charAt(i);
            while (i <= j && s.charAt(i) == d)
                i++;
            while (i <= j && s.charAt(j) == d)
                j--;
          } 
	  System.out.print("Minimum length:");
	  return j - i + 1;  
    	}
	public static void main(String args[]) {
	StringMin sm = new StringMin();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string:");
	String str = sc.nextLine();
	System.out.println(sm.solve(str));
	}
}