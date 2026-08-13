class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        HashMap<Integer,Integer> a=new HashMap<>();
        int s=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            if(s==k)
            {
                c++;
            }
            if(a.containsKey(s-k))
            {
                int x=a.get(s-k);
                c+=x;
            }
            if(a.containsKey(s))
            {
                a.put(s,a.getOrDefault(s,1)+1);
            }
            else
            {
                a.put(s,1);
            }
        }
        return c;
    }
}