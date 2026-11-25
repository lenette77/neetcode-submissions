class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> differenceMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            differenceMap.put(nums[i], i);
        }
        for(int i=0; i< nums.length;i++){
            int diff = target - nums[i];
            if(differenceMap.containsKey(diff) && differenceMap.get(diff) != i){
            return new int[]{i, differenceMap.get(diff)};
            }
        }
        return new int[0];
    }
}
