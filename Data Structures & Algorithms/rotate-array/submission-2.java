class Solution{
public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;

    rev(0, n - k - 1, nums);
    rev(n - k, n - 1, nums);
    rev(0, n - 1, nums);
}

public void rev(int l, int r, int[] nums) {
    while (l < r) {
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
        l++;
        r--;
    }
}
}