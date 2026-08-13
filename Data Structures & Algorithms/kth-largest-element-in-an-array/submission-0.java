class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]); // Always add the element first
            
            // If the heap exceeds size k, pop the smallest element
            if (a.size() > k) {
                a.poll(); // Efficiently removes the minimum element
            }
        }
        
        return a.peek(); // The root is now the K-th largest element
    }
}
