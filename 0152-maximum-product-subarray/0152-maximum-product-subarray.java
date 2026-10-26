class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],i,j,m;
        for(i=0;i<nums.length;i++){
            m=nums[i];
            max=Math.max(max,m);
            for(j=i+1;j<nums.length;j++){
                m=m*nums[j];
                max=Math.max(max,m);
            }
        }
        return max;
    }
}