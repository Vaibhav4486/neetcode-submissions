class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        return self.h(s,t,0,0)
    def h(self,s,t,m,n):
        if(m==len(s)):
            return True
        if(n==len(t)):
            return False
        if(s[m]==t[n]):
            return self.h(s,t,m+1,n+1)
        return self.h(s,t,m,n+1)
        


        