class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n= nums.length;
        int[] res = new int[n];
        res[n-1]=1;
        for(int i=n-1;i>0;i--){
            res[i-1] = res[i] * nums[i];
        }

        int currProd = 1;

        for(int i=0;i<n;i++){
            res[i] = res[i]*currProd;
            currProd*=nums[i];
        }

        return res;

    }
}  
