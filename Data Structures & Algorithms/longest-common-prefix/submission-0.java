class Solution { 
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Loop through every character of the first word
        for (int i = 0; i < strs[0].length(); i++) { 
            char s = strs[0].charAt(i); // Fixed syntax: charAt(i) instead of [i]
            
            // Compare this character with the rest of the words
            for (int j = 1; j < strs.length; j++) { 
                // CRITICAL FIX: If 'i' reaches the end of any word, or characters mismatch
                if (i == strs[j].length() || strs[j].charAt(i) != s) { 
                    return strs[0].substring(0, i); 
                } 
            } 
        } 
        // If the first word itself is entirely the common prefix
        return strs[0]; 
    } 
}
