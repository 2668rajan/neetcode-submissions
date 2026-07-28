class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int p : piles){
            min = Math.min(min,p);
            max = Math.max(max,p);
        }
        int ans=Integer.MAX_VALUE;
        int start=1, end=max;

        while(start<=end){
            int mid = start + (end-start)/2;
            int totalHour = 0;

            for(int n : piles){
                if(n%mid>0){
                    totalHour += (n/mid)+1;
                }else{
                    totalHour += (n/mid);
                }
            }

            if(totalHour<=h){
                 
                ans = Math.min(ans,mid);
                end=mid-1;
            }else{
               start = mid+1;
            }

        }
        return ans;
    }
}
