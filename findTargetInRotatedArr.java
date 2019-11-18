//Find index of the target in a rotated sorted array / a circular array
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0 ){
            return -1;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] <= nums[end]){
                //right block is sorted
                if(target > nums[mid] && target <= nums[end]){
                    //target might be here.
                    start = mid+1;
                }else{
                    //okay then its in the left block
                    end = mid-1;
                }
            }else if(nums[start]<= nums[mid]){
                //left part is sorted
                if(target >= nums[start] && target< nums[mid]){
                    //target might be here.
                    end = mid-1;
                }else{
                    //okay then its in the left block
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
     
