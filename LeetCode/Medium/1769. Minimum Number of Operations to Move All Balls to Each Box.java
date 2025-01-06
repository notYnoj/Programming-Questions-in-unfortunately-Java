class Solution {
    public int[] minOperations(String boxes) {
        int size = boxes.length(); //.length()
        int[] ans = new int[size];
        ArrayList<Integer> pos = new ArrayList<Integer>(); //cant create an arraylist of ints due to primitive typing, also make sure to create a new object with a () becuz we need to call constructor
        for(int i = 0; i<boxes.length(); i++){
            if(boxes.charAt(i) == '1'){ //use charAt for String
                pos.add(i);
            }
        }
        for(int i = 0; i<size; i++){
            int cur_ans = 0;
            for(int j = 0; j<pos.size(); j++){//size for arraylist
                cur_ans+=(Math.abs(pos.get(j) - i));
            }
            ans[i] = cur_ans;
        }

        return ans;

    }
}  
