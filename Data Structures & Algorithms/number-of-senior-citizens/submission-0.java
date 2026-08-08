class Solution {
    public int countSeniors(String[] details) 
    {
        int a=0;
        for(int i=0;i<details.length;i++)
        {
           String s=details[i].substring(11,13);
            if(Integer.valueOf(s)>60)
            {
                a++;
            }

        }
        return a;
    }
}