class Solution {
    public void moveZeroes(int[] nums) {
        int count_zero = 0;

        for (int num : nums) {
            if (num == 0)
                count_zero++;
        }

        int ptr = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[ptr] = num;
                ptr++;
            }

        }
        for (int i = nums.length - 1; i >= nums.length - count_zero; i--) {
            nums[i] = 0;
        }
    }
}