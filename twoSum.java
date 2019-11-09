/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> seen = new HashMap<>(); //number, indices
        for(int i = 0; i < nums.length; i++){
            int lookingFor = target-nums[i];
            if(seen.containsKey(lookingFor)){
                ans[0]=seen.get(lookingFor);
                ans[1]=i;
            }else{
                seen.put(nums[i],i);
            }
        }
        return ans;
    }
}
