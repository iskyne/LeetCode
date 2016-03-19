package algorithms;
/*
 * 136. Single Number
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else{
            int sum=nums[0];
            for(int i=1;i<nums.length;i++){
                sum=sum^nums[i];
            }
            return sum;
        }
    }
}
