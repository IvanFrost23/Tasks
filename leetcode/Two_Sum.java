class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap <Integer, Integer> a = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            if (a.containsKey(target - nums[i]) && a.get(target - nums[i]) != i) {
                ans[0] = i;
                ans[1] = a.get(target - nums[i]);
                return ans;
            }
            a.put(nums[i], i);
        }
        return ans;
    }
}