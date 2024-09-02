class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] matrix = new int[m][n]; //this is how u create arrays
        if(original.length!=m*n) return new int[0][0];
        int ptr = 0;
        for(int i =0; i<m; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = original[ptr++];
            }
        }
        return matrix; 
    }
}
