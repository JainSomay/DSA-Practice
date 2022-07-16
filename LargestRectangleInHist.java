class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<Integer>();
        int n=heights.length;
        int Area=0;
        for(int i=0;i<=n;i++){
            int h=(i==n ? 0 :heights[i]);
            if(s.isEmpty() || h>=heights[s.peek()]){
                s.push(i);
            }
            else{
                int pop=s.pop();
                Area=Math.max(Area, heights[pop] * (s.isEmpty() ? i : i-1-s.peek()));
                i--;
            }
        }
        return Area;
    }
}
