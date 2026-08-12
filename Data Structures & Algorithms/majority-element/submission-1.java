class Solution {
    public int majorityElement(int[] nums) 
    {
        int k=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(k==0)
            {
                c=nums[i];
                k++;
            }
            k += (nums[i] == c) ? 1 : -1;

        }
        return c;
    }
}