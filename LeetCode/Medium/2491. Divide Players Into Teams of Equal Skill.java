class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum = 0;
        int n = skill.length;
        int need = skill[0] + skill[n-1];
        long z = skill[0]*skill[n-1];
        sum+=z;
        for(int i =1; i<(n/2); i++){
            int cur = skill[i] + skill[n-i-1];
            if(cur != need){
                return -1;
            }else{
                sum+=(skill[i]*skill[n-i-1]);
            }
        }
        return sum;
    }
}
