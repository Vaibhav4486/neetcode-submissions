class Solution {
    public int removeDuplicates(int[] nums) 
    {
            int l=0,k=1,r=1;
            while(l<nums.length & r<nums.length)
            {
                if(nums[r]!=nums[l])
                {
                    nums[k]=nums[r];
                    k++;
                    l=r;
                }
                r++;
            }
            return k;
    }
}