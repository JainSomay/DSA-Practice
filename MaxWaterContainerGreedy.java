class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int max_area=0;
        int high=height.length-1;
        while(low<high){
            max_area=Math.max(max_area, Math.min(height[low], height[high]) * (high-low));
            if(height[low]<height[high]){
                low++;
            }
            else
                high--;
        }
        return max_area;
    }
}
