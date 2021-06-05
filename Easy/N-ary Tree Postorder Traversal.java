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
    private List<Integer> arr = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        if(root == null){
            return arr;
        }
        
        for(int i=0;i<root.children.size();i++){
            if(root.children.get(i) != null)
                postorder(root.children.get(i));
            
        }
        arr.add(root.val);
        
        return arr;
    }
}
