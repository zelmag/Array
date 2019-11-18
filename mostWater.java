//2 pointers. find the 2 lines with most area
//take into consideration the minHeight between the 2 lines + distance between them
//2 pointers
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea, h*(right-left));
            //move the shorter line, in search for bigger line and bigger area
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
