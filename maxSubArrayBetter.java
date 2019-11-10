class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0; //current sum
        int res = nums[0]; //max sum
        for(int i = 0; i < nums.length; i++){
            sum = sum < 0 ? nums[i] : sum + nums[i]; //if the cumulative of the sub array is negative, anything + negative is smaller so you reset the cumulative sum. 
            res = sum > res ? sum : res; //replace max sum if sum > res
        }
        return res;
    }
}
