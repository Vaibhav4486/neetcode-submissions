
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; 
                }
            }
        }
        
        return result;
    }
}
