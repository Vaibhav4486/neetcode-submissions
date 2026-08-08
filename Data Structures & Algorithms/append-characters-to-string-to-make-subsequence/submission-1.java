class Solution {
    public int appendCharacters(String s, String t) 
    {
        int m = 0, n = 0;
        int tLen = t.length(), sLen = s.length();
        while (m < tLen && n < sLen) {
            if (s.charAt(n) == t.charAt(m)) {
                m++;
            }
            n++;
        }
        return tLen - m;
    }
}