/*Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6. */

import java.util.*;
class Solution
{
public int maxSubArray(int[] nums) 
{
int max=Integer.MIN_VALUE;
int prefix=0;
for(int i=0;i<nums.length;i++)
{
prefix+=nums[i];
if(prefix>max)
max=prefix;
if(prefix<0)
prefix=0;
}
return max;
}
}
class vISubarray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
Solution x=new Solution();
System.out.println(x.maxSubArray(a));
}
}

