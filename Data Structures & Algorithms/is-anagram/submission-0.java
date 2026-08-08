class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
         for(int i=0;i<s.length();i++)
        {
            a.put(t.charAt(i),a.getOrDefault(t.charAt(i),0)-1);
        }
        for(Character i:a.keySet())
        {
            if(a.get(i)!=0)
            {
                return false;
            }
        }
        return true;
    }
}
