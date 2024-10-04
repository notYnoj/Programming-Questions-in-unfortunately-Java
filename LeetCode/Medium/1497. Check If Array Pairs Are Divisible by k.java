class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] mods = new int[k];
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int cur = arr[i];
            cur = ((cur%k)+k)%k;
            mods[cur]++;
        }
        boolean good = true;
        for(int i =0; i<k; i++){
            if(i == 0){
                if(mods[0]%2 == 1){
                    good = false;
                }
            }
            int amnt = mods[i];
            int op = (k-i)%k;
            if(amnt == mods[op]){
                mods[i] = 0;
                mods[op]= 0;
            }
            if(mods[i]>0){
                return false;
            }
            if(good == false){
                return false;
            }
        }
        return good;
    }
}
