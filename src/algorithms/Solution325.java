package algorithms;

import java.util.HashMap;

public class Solution325 {
	public int maxSubArrayLen(int[] nums, int k) {
        int maxDistance=0;
        int sum=0;
        if(nums.length==0){
            return 0;
        }else if(nums.length==1){
            return nums[0]==k?1:0;
        }else{
            HashMap<Integer,Integer> dic=new HashMap<Integer,Integer>();
            dic.put(0,0);
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
                if(!dic.containsKey(sum)){
                    dic.put(sum,i+1);
                }
                if(dic.containsKey(sum-k)){
                    maxDistance=Math.max(maxDistance,i-dic.get(sum-k)+1);
                }
            }
            return maxDistance;
        }
    }
}
