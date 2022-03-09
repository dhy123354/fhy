package LeetCode100热题;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for (int i = 1; i < len; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{i,map.get(target-nums[i])};
            else
                map.put(nums[i],i);
        }
        return null;
    }
}
