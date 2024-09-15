class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> a = new HashMap<>();
        int cur = 97;
        for(int i = 0; i<key.length(); i++){
            if(key.charAt(i) == ' '){
                System.out.println("TRUE");
                continue;
            }else{
                if(a.getOrDefault(key.charAt(i), 'A') != 'A'){
                    continue;
                }
                char c = (char)(cur++);
                a.put(key.charAt(i), c);
            }
        }
        System.out.println(a.get('v'));
        String s = "";
        for(int i = 0; i<message.length(); i++){
            if(message.charAt(i) == ' '){
                s+=' ';
            }else{
                s+=a.get(message.charAt(i));
            }
        }
        return s;
    }
}
