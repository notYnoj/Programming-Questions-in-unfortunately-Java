class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a = queries.length;
        int[] ans = new int[a];
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            pref[i] = pref[i-1]^arr[i];
        }
        for(int i =0; i<queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            if(l == 0){
                ans[i] = pref[r];
            }else{
                ans[i] = pref[r]^pref[l-1];
            }
        }
        return ans; 
    }
}
