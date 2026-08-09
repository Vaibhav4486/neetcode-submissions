class Solution {
    public int maxDifference(String s) 
    {
        HashMap<Character, Integer> a = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            a.put(s.charAt(i), a.getOrDefault(s.charAt(i), 0) + 1);
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for(int freq : a.values())
        {
            if(freq % 2 == 1)
            {
                maxOdd = Math.max(maxOdd, freq);
            }
            else
            {
                minEven = Math.min(minEven, freq);
            }
        }

        return maxOdd - minEven;
    }
}