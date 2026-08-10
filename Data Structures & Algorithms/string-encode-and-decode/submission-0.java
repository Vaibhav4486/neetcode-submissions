public class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder s = new StringBuilder();

        for(String str : strs)
        {
            s.append(str.length());
            s.append("#");
            s.append(str);
        }

        return s.toString();
    }

    public List<String> decode(String s) 
    {
        List<String> result = new ArrayList<>();

        int i = 0;

        while(i < s.length())
        {
            int j = i;

            // Find the '#' after the length
            while(s.charAt(j) != '#')
            {
                j++;
            }

            // Get the length of the original string
            int len = Integer.parseInt(s.substring(i, j));

            // Start of the actual string
            int start = j + 1;

            // Extract exactly 'len' characters
            result.add(s.substring(start, start + len));

            // Move to the beginning of the next encoded string
            i = start + len;
        }

        return result;
    }
}