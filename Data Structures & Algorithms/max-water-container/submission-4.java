class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j = heights.length - 1;
        int maxArea = 0;

        while(i<j) {
            int min = Math.min(heights[i],heights[j]);
            maxArea = Math.max(maxArea,min*(j-i));

            if(heights[i]<=heights[j]) {
                i++;
            } else {
                j--;
            } 
        }

        return maxArea;

        
    }
}

