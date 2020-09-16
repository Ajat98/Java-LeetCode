//https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
            
        
        int[] res = new int[2]; //set static size of array
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //setup hashmap of Int and Int
        
        for (int i=0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {     //checks if target - current val is a key. If so we have a match
                res[1] = i;
                res[0] = map.get(target-nums[i]);        //gets value that fits with i to sum to the target
                return res;
            }
            map.put(nums[i], i);                     //maps index to value in array
        }
        return res;
    }
}
