import java.util.*;
class duplicate
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n1=s.nextInt();
int nums1[]=new int[n];
int nums2[]=new int[n1];
int nums3[]=new int[n+n1];
for(int h=0;h<n;h++)
nums1[h]=s.nextInt();
for(int y=0;y<n1;y++)
nums2[y]=s.nextInt();
int k=0;
nums3[k]=0;
        int result=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                    
                if(nums1[i]==nums2[j])        //4 9 5
                {                             //9 4 9 8 4
                    
                    while(nums3[k]!=nums1[i])
                    {
                        nums3[k+1]=nums1[i];
                        k+=1;
                    }
                    break;  
                }
            }
      }
for(int g=0;g<nums3.length;g++)
{
if(nums3[g]!=0)
System.out.print(nums3[g]+" ");
}
}
}       