import java.util.*;
import java.io.*;

class hack4{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> x=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            x.put(name,phone);
        }
        //while(in.hasNext())
       
        for(int j=0;j<n;j++)
        {
            String s = in.next();  //key --> s
            // Write code here
            if(x.containsKey(s))
            System.out.println(s+"="+x.get(s));
            else
            System.out.println("Not found");
        }

        in.close();
    }
}