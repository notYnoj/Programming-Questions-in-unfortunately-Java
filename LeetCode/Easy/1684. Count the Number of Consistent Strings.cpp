class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Boolean> a = new ArrayList<>(Collections.nCopies(26, false));
        for(int i = 0; i<a.size(); i++){ //.size()

        }
        for(int i = 0; i<allowed.length(); i++){ //.length() is for strings .length is for arrays .size() is for arraylists
            char c = allowed.charAt(i);
            if(!a.get(c-'a')){
                a.set(c-'a', true); //.set is for ArrayList
            }
        }
        int ans = 0;
        for(String i: words){
            boolean good = true;
            for(int z = 0; z<i.length(); z++){
                char c = i.charAt(z); //remember .charAt is for Strings
                if(!a.get(c-'a')){ //.get is for ArrayLists
                    good = false;
                    break;
                }
            }
            if(good) ans++; // no need for brackets here
        }
        return ans;

    }
}
