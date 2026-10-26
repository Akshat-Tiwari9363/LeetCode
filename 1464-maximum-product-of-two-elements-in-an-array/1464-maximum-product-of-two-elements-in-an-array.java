class Solution {
    public int maxProduct(int[] nums) {
        int m1=0,m2=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]>m1){
                m2=m1;
                m1=nums[i];
                continue;
            }if(m2<nums[i]){
                m2=nums[i];
            }
        }
        return (m1-1)*(m2-1);
    }
}