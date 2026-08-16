class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        HashSet<List<Integer>> a=new HashSet<>(); 
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int s=nums[i]+nums[l]+nums[r];
                if(s==0)
                {
                    a.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    
                }
                else if(s<0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return new ArrayList<>(a);
    }
}
