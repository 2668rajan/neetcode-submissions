class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> result = new ArrayList<>();
        // int n = nums.length;
        // Arrays.sort(nums);

        // for (int i = 0; i < n-2; i++) {
        //     if(i>0 && nums[i-1]==nums[i]) continue;
            
        //     int  start =i+1, end=n-1;
        //     while (start<end){
        //         int sum = nums[i] + nums[start] + nums[end];
        //         if (sum == 0){
        //             List<Integer> list = Arrays.asList(nums[i], nums[start], nums[end]);
        //             result.add(list);

        //             start++;
        //             end--;

        //             while (start<end && nums[start]==nums[start-1]) start++;
        //             while(start<end && nums[end]==nums[end+1]) end--;
        //         } else if (sum > 0) {
        //             end--;
        //         }else{
        //             start++;
        //         }
        //     }

        // }
        // return result;

        /*
            2. Hashing approach
        */

        int n = nums.length;
        List<List<Integer>> result = new ArrayList();
        Set<List<Integer>> set = new HashSet();

        for(int i=0;i<n-1;i++){
            Set<Integer> map = new HashSet();
            for(int j=i+1;j<n;j++){
                int third = (nums[i] + nums[j]) * (-1);
                if(map.contains(third)){
                    List<Integer> list = 
                    Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(list);
                    set.add(list);
                }
                map.add(nums[j]);
            }
        }
        result = new ArrayList(set);
        return result;
    }
}
