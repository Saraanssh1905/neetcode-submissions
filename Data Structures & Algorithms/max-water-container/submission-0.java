class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea=0;
        while(left<right){
            int minHeight=Math.min(heights[left],heights[right]);
            int width=right-left;
            int currArea= minHeight*width;

            maxArea=Math.max(currArea,maxArea);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
