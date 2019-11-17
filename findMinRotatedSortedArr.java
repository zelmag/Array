//Find min in a rotated sorted array. Pivot is the ONLY element who is < element before it. also the minimum
//Binary search for the pivot
class Solution {
    public int findMin(int[] nums) {
        if(nums[0] <= nums[nums.length-1]){ 
              return nums[0];
          }
          int start = 0;
          int end = nums.length-1;
          while(start <= end){
              int mid = start + ((end - start)/2);
              if(nums[mid] > nums[mid+1]){
                  int pivot = nums[mid+1];
                  return pivot;
              }
              else if(nums[start] <= nums[mid]){
                  //pivot is in the right half
                  start = mid+1;
              }
              else{
                  end = mid-1;
              }
          }
        return -1;
    }
}
