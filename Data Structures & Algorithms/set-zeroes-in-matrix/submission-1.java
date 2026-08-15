class Solution {
    public void setZeroes(int[][] matrix) 
    {
        boolean[] z=new boolean[matrix.length];
        boolean[] zc=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    z[i]=true;
                    zc[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            if(z[i])
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            if(zc[j])
            {
                for(int i=0;i<matrix.length;i++)
                {
                           matrix[i][j]=0;
                }
            }
        }
    }
}
