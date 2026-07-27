class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        if(s.isBlank()) return 1;

         int max=1;
        int n=s.length();
        int left=0, right=0;
        boolean[] vis = new boolean[128];

        while(right<n){

            while(vis[s.charAt(right)]){
                vis[s.charAt(left)] = false;
                left++;
            }
            max = Math.max(max, right-left+1);
            vis[s.charAt(right)] = true;
            right++;
        }

        return max;
    }
}
