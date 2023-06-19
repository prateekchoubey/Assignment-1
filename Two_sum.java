import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        int ans[] = new int[2];

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            if (nums[low] + nums[high] == target) {
                a = nums[low];
                b = nums[high];
                break;
            } else if (nums[low] + nums[high] < target) {
                low++;
            } else {
                high--;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (a == temp[i]) {
                ans[0] = i;
                break;
            }

        }

        for (int i = 0; i < temp.length; i++) {
            if (b == temp[i] && i != ans[0]) {
                ans[1] = i;
                break;
            }

        }
        return ans;
    }
}