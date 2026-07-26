class Solution {
    public int maxArea(int[] heights) {
        // int max=0;
        // int n = heights.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         int prod = (j-i) * Math.min(heights[i], heights[j]);
        //         max = Math.max(prod, max);
        //     }
        // }
        // return max;

        /*
            2. Two pointer approach
        */
        int n = heights.length;
        int maxArea = 0;
        int l=0, r=n-1;

        while(l<r){
            int width = r-l;
            int height = Math.min(heights[l], heights[r]);

            maxArea = Math.max(maxArea, width*height);

            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}
