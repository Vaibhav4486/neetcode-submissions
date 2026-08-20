class Solution {
    public int search(int[] nums, int target) 
    {
        // Fix 1: Change nums.length to nums.length - 1
        return h(nums, 0, nums.length - 1, target);
    }
    
    public int h(int[] nums, int l, int h, int t)
    {
        if (l > h)
        {
            return -1;
        }
        
        int mid = l + (h - l) / 2; 
        
        if (nums[mid] == t)
        {
            return mid;
        }
        else if (nums[mid] > t)
        {
            h = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
        return h(nums, l, h, t);
    }
}
