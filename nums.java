import java.util.*;
class nums
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++)
a[j]=s.nextInt();
int target=s.nextInt();
int result=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)   //1 3 5 7
            {
                result=i;
                System.out.println(result); 
               
            }
            else if(a.length==1 && target!=0)
            {
                result=1;
                 System.out.println(result); 
            }
               
               
            else if(a[i]<target && a[i+1]>target)
            {
                result=i+1;
               System.out.println(result);
              
            }
            else if(a[i]<target && a[n-1]<target)
            {
                result=n;
               System.out.println(n);
               
            }
            else if(target==0)
            {
                result=0;
               System.out.println(result);
               break;
              
            }
        }
        
    }
}
