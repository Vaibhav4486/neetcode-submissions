
class Solution { 
    public List<String> stringMatching(String[] words) { 
        List<String> a = new ArrayList<>(); 
        
        for (int i = 0; i < words.length; i++) { 
            for (int j = 0; j < words.length; j++) { 
                if (i == j) continue; 
                
                if (words[j].indexOf(words[i]) != -1) { 
                    a.add(words[i]); 
                    break; // Stop checking once we know words[i] is a substring
                } 
            } 
        } 
        return a; 
    } 
}
