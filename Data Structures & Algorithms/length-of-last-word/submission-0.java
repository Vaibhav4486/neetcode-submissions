class Solution {
    public int lengthOfLastWord(String s) 
    {
        String[] w=s.trim().split("\\s+");
        return w[w.length-1].length();
    }
}