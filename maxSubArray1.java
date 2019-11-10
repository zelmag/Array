//find the max sum of a contiguous subarray
//KEY idea: once the subarray becomes negative, throw it away bc anything + negative < anything
//say -2 + (1) < 1
// or -2 + (-3) < (-3). The single number is bigger than that sum
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int start = 0; //start of subarray
        int end = 0; //end of subarray
        int curr = 0;
        while(start < nums.length && end < nums.length){
            curr+=nums[end];
            if(curr > max){
                max = curr;
            }
            if(curr < 0){ //if the sum ever becomes negative, reset sum to 0 and move the starting point by one. 
                curr = 0;
                start++;
                end = start;
            }else{
                end++;
            }
        }
    }
}
