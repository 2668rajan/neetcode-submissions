class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int n = heights.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int prod = (j-i) * Math.min(heights[i], heights[j]);
                max = Math.max(prod, max);
            }
        }
        return max;
    }
}
