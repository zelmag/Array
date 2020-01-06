class Solution {
    public int maxArea(int[] height) {
       int hLeft = 0;
       int hRight = height.length-1;
       int maxArea = Math.min(height[hLeft],height[hRight])*(hRight - hLeft);
        while(hLeft < hRight){
            if(height[hLeft] < height[hRight]){
                hLeft++;
            }else{
                hRight--;
            }
            maxArea = Math.max(maxArea,Math.min(height[hLeft],height[hRight])*(hRight - hLeft));
        }
        return maxArea;
    }
}
