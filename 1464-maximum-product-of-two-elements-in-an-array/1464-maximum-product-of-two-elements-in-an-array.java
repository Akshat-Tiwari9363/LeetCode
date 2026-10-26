class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,i,j;
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                max=Math.max(((nums[i]-1)*(nums[j]-1)),max);
            }
        }
        return max;        
    }
}