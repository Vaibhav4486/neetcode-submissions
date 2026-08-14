class Solution {
    public int maxSubArray(int[] nums) 
    {
        int m=Integer.MIN_VALUE,s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            m=Math.max(m,s);

            if(s<0)
            {
                s=0;
            }
        }
        return m;
    }
}
