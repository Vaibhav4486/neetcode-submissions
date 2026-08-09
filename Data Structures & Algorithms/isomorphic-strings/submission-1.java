
class Solution { 
    public boolean isIsomorphic(String s, String t) { 
        if (s.length() != t.length()) { 
            return false; 
        } 
        
        HashMap<Character, Character> a = new HashMap<>(); 
        
        for (int i = 0; i < s.length(); i++) { 
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (!a.containsKey(charS)) { 
                if (a.containsValue(charT)) {
                    return false;
                }
                a.put(charS, charT); 
            } 
        } 
        
        StringBuilder b = new StringBuilder(); 
        for (int i = 0; i < s.length(); i++) { 
            b.append(a.get(s.charAt(i))); 
        } 
        
        return b.toString().equals(t); 
    } 
}
