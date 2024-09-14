class Solution {
    public int longestSubarray(int[] nums) {
        int mx = 0;
        for(int i = 0; i<nums.length; i++){
            mx = Math.max(nums[i], mx);
        }
        int ans = 0;
        for(int i = 0, j = 0; i<nums.length; i++){
            if(nums[i] == mx){
                j = i;
                while(i<nums.length-1 && nums[i+1] == mx){
                    i++;
                }
                ans = Math.max(i-j+1, ans);
            }
        }
        return ans;
    }
}
