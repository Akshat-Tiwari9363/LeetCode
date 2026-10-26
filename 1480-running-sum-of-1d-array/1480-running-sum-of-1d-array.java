class Solution {
    public int[] runningSum(int[] nums) {
        int i,s=0;
        for(i=0;i<nums.length;i++){
            s=s+nums[i];
            nums[i]=s;
        }
        return nums;        
    }
}