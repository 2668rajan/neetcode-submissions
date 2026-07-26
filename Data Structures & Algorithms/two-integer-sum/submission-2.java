class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map<Integer, Integer> map = new HashMap();
        // map.put(nums[0],0);

        // for(int i=1;i<nums.length;i++){
        //     if(map.containsKey(target-nums[i])){
        //         return new int[]{map.get(target-nums[i]),  i};
        //     }
        //     map.put(nums[i], i);
        // }
        // return new int[]{-1,-1};

        int i,j,temp;
        for( i=1;i<nums.length;i++){
            for(j=i;j<nums.length;j++){
                temp = j-i;
                if(nums[temp] + nums[j] == target){
                    return new int[]{temp,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
