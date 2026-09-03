class Solution {
    public int missingNumber(int[] nums) 
    {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
        }
        return (nums.length*(nums.length+1))/2-s;
        
    }
}
