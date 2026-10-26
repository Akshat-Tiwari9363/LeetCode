class Solution {
    public int maximumProduct(int[] nums) {
        int i,ma1=Integer.MIN_VALUE,ma2=Integer.MIN_VALUE,ma3=Integer.MIN_VALUE,mi1=Integer.MAX_VALUE,mi2=Integer.MAX_VALUE;
        for(i=0;i<nums.length;i++){
            if(nums[i]>ma1){
                ma3=ma2;
                ma2=ma1;
                ma1=nums[i];
            }else if(nums[i]>ma2){
                ma3=ma2;
                ma2=nums[i];
            }else if(nums[i]>ma3){
                ma3=nums[i];                
            }
            if(nums[i]<mi1){
                mi2=mi1;
                mi1=nums[i];
            }else if(nums[i]<mi2){
                mi2=nums[i];
            }
        }
        return Math.max(ma1*ma2*ma3,mi1*mi2*ma1);
    }
}