class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        if(s.length() == k){
            return true;
        }
        int[] length = new int[k];
        int[] alp = new int[26];
        for(int i =0; i<s.length(); i++){
            alp[s.charAt(i) - 'a']++;
        }
        int ptr = 0;
        for(int i = 0; i<26; i++){
            if(alp[i]%2 == 1){
                if(ptr == k){
                    return false;
                }
                length[ptr++]++;
            }
            if(ptr>k){
                return false;
            }
        }
        return true;

    }
}
