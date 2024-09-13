class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hsh = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int cur = nums[i];
            int comp = target-cur;
            if(hsh.getOrDefault(comp, -1)>=0){
                int[] m = new int[2];
                m[0] = i;
                m[1] =  hsh.get(comp);
                return m;
            }else{
                hsh.put(cur, i);
            }
        }
        return new int[0];
    }
}
