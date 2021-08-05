import java.util.*;
class NumArray {
int[] prefix;
public NumArray(int[] nums) {
int n= nums.length;
prefix = new int[n];
prefix[0]=nums[0];
for(int i=1;i<n;i++)
prefix[i]= prefix[i-1]+nums[i];
}
public int sumRange(int left, int right) {
/*int sum=0;
if(left==0)
sum=prefix[right];
else
sum = prefix[right]- prefix[left-1];
return sum;*/
return (left==0)? prefix[right] :prefix[right]- prefix[left-1];
}
}
class important_prefix
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int num[]=new int[size];
for(int i=0;i<size;i++)
num[i]=s.nextInt();
NumArray x=new NumArray(num);
System.out.println(x.sumRange(s.nextInt(),s.nextInt()));
}
}

