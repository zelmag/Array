//O(n^2) to find a+b+c = 0
//sort and then use pointers for the last 2 numbers that added equal to the inverse of the first.
//if the sum < 0, move left pointer to the right because want a bigger sum. else if sum > 0, end --
//keep moving the pointer to avoid duplicates
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length - 3; i++){
            if(i == 0 || nums[i] > nums[i-1]){
                int start = i+1;
                int end = nums.length-1;
                while(start < end){
                    if(nums[i]+nums[start]+nums[end] == 0){
                        //add this to list
                        res.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    }
                    if(nums[i]+nums[start]+nums[end] < 0){
                        int currStart = nums[start];
                        while(currStart == nums[start] && start<end){
                            start++;
                        }
                    }else if(nums[i]+nums[start]+nums[end] >= 0){
                        int currEnd = nums[end];
                        while(currEnd == nums[end] && start<end)
                            end--; //greater than 0 so decrease
                        }
                }
            }
        }
        return res;
    }
}
