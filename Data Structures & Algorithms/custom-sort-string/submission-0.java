class Solution {
    public String customSortString(String order, String s)
    {
        HashMap<Character, Integer> a = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            a.put(s.charAt(i), a.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder r = new StringBuilder();

        for(int i = 0; i < order.length(); i++)
        {
            char c = order.charAt(i);

            if(a.containsKey(c))
            {
                r.append(String.valueOf(c).repeat(a.get(c)));
                a.remove(c);
            }
        }

        if(a.size() != 0)
        {
            for(Character i : a.keySet())
            {
                r.append(String.valueOf(i).repeat(a.get(i)));
            }
        }

        return r.toString();
    }
}