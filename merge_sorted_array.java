class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        int y = 0;
        int z = 0;
        int ans[] = new int[m + n];
        while (x < m && y < n) {
            if (nums1[x] <= nums2[y]) {
                ans[z] = nums1[x];
                z++;
                x++;
            } else {
                ans[z] = nums2[y];
                z++;
                y++;
            }

        }
        while (x < m) {
            ans[z] = nums1[x];
            z++;
            x++;
        }
        while (y < n) {
            ans[z] = nums2[y];
            z++;
            y++;
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = ans[i];
        }

    }
}