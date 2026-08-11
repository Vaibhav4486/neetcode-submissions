class Solution {
    public int[] minOperations(String boxes) 
    {
        int[] ans=new int[boxes.length()];
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<boxes.length();i++)
        {
            if(boxes.charAt(i)=='1')
            {
                a.add(i);
            }
        }
        for(int i = 0; i < boxes.length(); i++)
{
    for(int j : a)
    {
        ans[i] += Math.abs(i - j);
    }
}
        return ans;
    }
}