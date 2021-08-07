import java.util.*;
class single_digit3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int nums[]=new int[n];  
for(int i=0;i<n;i++)
nums[i]=s.nextInt();     

        int num = 0;
        for(int i = 0; i < n; i++) 
         {
            int count = 0;
            for(int j = 0; j < n; j++) 
            {
                if(nums[i] == nums[j])
                    count++;
            }
            
            if(count == 1) 
            {
                num =  nums[i];
                break;
            
            }
                
        }
        
        System.out.println(num);
    }
}