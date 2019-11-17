//Since its product, you need a min for negative -2*-2  could all of a sudden become the max
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int currMin = nums[0];
        int currMax = nums[0];
        int totalMax = nums[0];
        for(int i = 1; i < nums.length; i++){
            int tempCurrMax = currMax; //bc currMax gets updated
           currMax = Math.max(Math.max(currMax * nums[i], currMin * nums[i]) , nums[i]);
            currMin = Math.min(Math.min(tempCurrMax * nums[i], currMin * nums[i]) , nums[i]);
            totalMax = Math.max(currMax, totalMax);
        }
        return totalMax;
    }
}
