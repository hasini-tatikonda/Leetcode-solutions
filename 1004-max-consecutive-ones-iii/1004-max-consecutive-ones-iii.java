class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0&&k!=0){
                k--;
            }
            else if(nums[r]==0&&k==0){
                while(nums[l]!=0){
                    l++;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}