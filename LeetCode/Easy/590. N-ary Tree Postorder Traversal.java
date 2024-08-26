/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null){
            return ans;
        }
        HashMap<Node, Boolean> mp = new HashMap<Node, Boolean>();
        stack.push(root);
        while(!stack.empty()){
            Node cur = stack.peek();
            List<Node> child = new ArrayList<Node>();
            child = cur.children;
            Boolean plc = true;
            for(int i = 0; i<child.size(); i++){
                if(child.get(i) == null){
                    continue;
                }else{
                    plc = plc&mp.getOrDefault(child.get(i), false);
                }
                if(plc == false){
                    break;
                }
            }
            if(plc){
                ans.add(cur.val);
                stack.pop();
                mp.put(cur, true);
            }else{
                for(int i = child.size()-1; i>=0; i--){
                    stack.push(child.get(i));
                }
            }
        }
        return ans;
    }
}
