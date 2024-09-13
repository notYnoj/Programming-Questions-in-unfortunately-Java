class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int cur = (ch-'a'+1);
            if(cur>=10){
                while(cur>=10){
                    sum+=cur%10;
                    cur/=10;
                }
                sum+=cur;
            }else{
                sum+=cur;
            }
        }
        k--;
        while(k>0){
            int cur = sum;
            sum = 0;
            while(cur>=10){
                    sum+=cur%10;
                    cur/=10;
                }
            sum+=cur;
            k--;
        }
        return sum;
    }
}
