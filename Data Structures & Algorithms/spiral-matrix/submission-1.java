class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a = new ArrayList<>();

        int t = 0;
        int l = 0;
        int b = matrix.length - 1;
        int r = matrix[0].length - 1;

        while (t <= b && l <= r) {

            // Traverse top row
            for (int i = l; i <= r; i++) {
                a.add(matrix[t][i]);
            }
            t++;

            // Traverse right column
            for (int i = t; i <= b; i++) {
                a.add(matrix[i][r]);
            }
            r--;

            // Traverse bottom row
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    a.add(matrix[b][i]);
                }
                b--;
            }

            // Traverse left column
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    a.add(matrix[i][l]);
                }
                l++;
            }
        }

        return a;
    }
}
