package algorithms;
//303. Range Sum Query - Immutable
public class Solution303 {
    private int[] sum;
    private int[] nums;
    public Solution303(int[] nums) {
        this.nums=nums;
        sum=new int[nums.length];
        if(nums.length>0){
            sum[0]=nums[0];
        }
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j]-sum[i]+this.nums[i];
    }
}
