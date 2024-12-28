/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap=new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            //try to find target-nums[i]
            int targetNum=target-nums[i];
            if(numMap.containsKey(targetNum)){
                return new int[]{i,numMap.get(target-nums[i])};
            }
        }
        return nums;
    }
}
// @lc code=end
