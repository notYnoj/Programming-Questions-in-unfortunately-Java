class Solution {
    public int chalkReplacer(int[] c, long k) {
        long total = 0;
        for(int i = 0; i<c.length; i++){
            total+=c[i];
        }
        long z = k%total;
        for(int i = 0; i<c.length; i++){
            z-=c[i];
            if(z<0){
                return i;
            }
        }
        return c.length-1;
    }
}
