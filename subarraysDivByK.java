import java.util.*;
class Solution {
public int subarraysDivByK(int[] nums, int k) {
int count=0;int prefix=0;
int rem;
HashMap<Integer,Integer> dic = new HashMap<Integer,Integer>();
dic.put(0,1);
int n=nums.length;
for(int i=0;i<n;i++)
{
prefix = prefix+nums[i];
rem= prefix%k;
if(rem<0)
rem=rem+k;

if(dic.containsKey(rem))
{
count= count+dic.get(rem);
dic.put(rem,dic.get(rem)+1);
}
/* if(dic.containsKey(rem))
 dic.put(rem,dic.get(rem)+1); */
else
{
dic.put(rem,1);
}
}
return count;
}
}
class vIsubarraysDivByK
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
Solution x=new Solution();
System.out.println(x.subarraysDivByK(a,s.nextInt()));
}
}
