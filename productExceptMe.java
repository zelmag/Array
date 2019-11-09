//notice ans[i] is the product of everything before it AND everything after. 
//O(N) time without using division

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int forwardProd = 1;
        for(int i = 0; i < nums.length; i++){
            ans[i] = forwardProd;
            forwardProd*=nums[i]; //for the next one 
        }
        int backwardProd = 1;
        for(int i = nums.length-1; i >= 0; i--){
            ans[i] *= backwardProd;
            backwardProd*=nums[i]; //include it the next one 
        }
        return ans;
    }
}
