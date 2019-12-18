/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remTarget = target - nums[i];
            if(map.containsKey(remTarget)){
                return new int[]{i,map.get(remTarget)};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
