class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length()) return false;

        /*
            the approach is that instead of finding out the permutations of s1.
            we will look into the s2, to find out if it contains the permutation of s1 or not, by trying to  maintain a window of length of s1.

        */

       int[] s1count = new int[26];
       int[] windowCount = new int[26];

       for(char ch : s1.toCharArray()){
            s1count[ch-'a']++;
       }

    int n = s1.length();
       for(int i=0; i<s2.length();i++){

        //increase the character count by 1
        windowCount[s2.charAt(i)-'a']++;

        //if the i passes the length of s1,
        // in order to main the window size m decrease the leftmost
        //character by 1
        if(i>=n){
            windowCount[s2.charAt(i-n)-'a']--;
        }

        //check if both the array are equals or not
        if(Arrays.equals(s1count, windowCount)) return true;
       }
       return false;
    }
}
