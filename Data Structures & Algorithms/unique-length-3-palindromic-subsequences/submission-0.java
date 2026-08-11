class Solution {
    public int countPalindromicSubsequence(String s)
    {
        int count = 0;

        for(char c = 'a'; c <= 'z'; c++)
        {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);

            if(first == -1 || first == last)
            {
                continue;
            }

            HashSet<Character> set = new HashSet<>();

            for(int i = first + 1; i < last; i++)
            {
                set.add(s.charAt(i));
            }

            count += set.size();
        }

        return count;
    }
}