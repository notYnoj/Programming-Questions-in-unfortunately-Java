class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int k = arr.length;
        int[] copy = new int[k];
        for(int i = 0; i<k; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer, Integer> hsh = new HashMap<Integer, Integer>();
        int cur = 1;
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
            if(hsh.getOrDefault(copy[i], -1) == -1){
                hsh.put(copy[i],cur++);
            }
        }
        for(int i = 0; i<copy.length; i++){
            copy[i] = hsh.get(arr[i]);
        }
        return copy;
    }
}
