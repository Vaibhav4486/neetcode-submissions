class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) 
    {
        int[] prefix = new int[words.length];

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];

            if(isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1)))
            {
                prefix[i] = 1;
            }

            if(i > 0)
            {
                prefix[i] += prefix[i - 1];
            }
        }

        int[] ans = new int[queries.length];

        for(int i = 0; i < queries.length; i++)
        {
            int l = queries[i][0];
            int r = queries[i][1];

            if(l == 0)
            {
                ans[i] = prefix[r];
            }
            else
            {
                ans[i] = prefix[r] - prefix[l - 1];
            }
        }

        return ans;
    }

    public boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || 
               c == 'o' || c == 'u';
    }
}