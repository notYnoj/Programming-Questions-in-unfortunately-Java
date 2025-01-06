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

/*
class Solution {
    public int[] minOperations(String boxes) {
        int size = boxes.length(); //.length()
        int[] ans = new int[size];
        //we need to figure out how many balls are on the left and right of a given number.
        //then simply add moves needed to the left by the number of balls to the right each time
        //then add movesleft to current index
        int balls = 0;
        int moves = 0;
        for(int i = 0; i<size; i++){
            ans[i]+=moves; //moves
            if(boxes.charAt(i) == '1'){
                balls++;
            }
            moves+=balls;
        }
        balls = 0;
        moves = 0;
        for(int i = size-1; i>=0; i--){
            ans[i]+=moves; //moves
            if(boxes.charAt(i) == '1'){
                balls++;
            }
            moves+=balls;
        }

        return ans;

    }
}
o(N) solution.
This solution comes from the fact that balls may only move left or right to get to a position
so some balls are going to come from the left and others are going to come from the right
thus lets use this information

after every index
the amount that the balls on the left need to move increases by 1
thus the amount of moves for the balls increases by the amount of balls to the left at a given position i (inclusive) for i+1
thus use this info and find answer
*/
