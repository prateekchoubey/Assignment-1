// O(nlogn)

// import java.util.Arrays;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[i]==nums[i+1])
//                 return true;
//         }
//         return false;
//     }
// }

//O(n)

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        
        return false;
    }
}
