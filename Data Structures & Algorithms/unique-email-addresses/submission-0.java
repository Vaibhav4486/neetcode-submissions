class Solution {
    public int numUniqueEmails(String[] emails) 
    {
        HashSet<String> a = new HashSet<>();

        for(int i = 0; i < emails.length; i++)
        {
            String email = emails[i];

            int plus = email.indexOf('+');
            int at = email.indexOf('@');

            StringBuilder b = new StringBuilder();

            // Process local part
            for(int j = 0; j < (plus == -1 ? at : plus); j++)
            {
                if(email.charAt(j) != '.')
                {
                    b.append(email.charAt(j));
                }
            }

            // Add domain
            b.append(email.substring(at));

            a.add(b.toString());
        }

        return a.size();
    }
}