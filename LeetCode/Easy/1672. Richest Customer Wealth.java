class Solution {
    public int maximumWealth(int[][] accounts) {
        Integer max = 0;
        for(int i = 0; i<accounts.length/*we use .length as arrays (matrix in this case) arent actually classes thus they cant use methods and so we use .length*/; i++){
            Integer cur = 0;
            for(int j = 0; j<accounts[0].length; j++){
                cur+=accounts[i][j];
            }
            max = Integer.max(max, cur);
        }
        return max;
    }
}
