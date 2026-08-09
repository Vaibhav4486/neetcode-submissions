class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String, List<String>> a = new HashMap<>();

        for(int i = 0; i < strs.length; i++)
        {
            char[] b = strs[i].toCharArray();
            Arrays.sort(b);
            String sorted = new String(b);

            a.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(a.values());
    }
}
