class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        return h(s,t,0,0);
    }
    public boolean h(String s,String t,int m,int n)
    {
        if(m==s.length())
        {
            return true;
        }
        if(n==t.length())
        {
            return false;
        }
        if(s.charAt(m)==t.charAt(n))
        {
            return h(s,t,m+1,n+1);
        }
        return h(s,t,m,n+1);
    }
}