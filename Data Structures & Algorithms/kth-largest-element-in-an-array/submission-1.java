class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> a=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            if(a.size()==k && nums[i]>a.peek())
            {
                a.remove(a.peek());
                a.add(nums[i]);
            }
            else if (a.size() < k)
            {
                a.add(nums[i]);
            }
        }
        return a.peek();
    }
}
