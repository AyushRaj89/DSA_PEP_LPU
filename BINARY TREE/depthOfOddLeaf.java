/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    static int ans;
    public static int depthOfOddLeaf(Node root) {
        // code here
        ans = 0;
        dfs(root, 1);
        return ans;
    }
    
    static void dfs(Node root, int level) {
        if(root == null) return;
        
        if(root.left == null && root.right == null) {
            if(level % 2 != 0) {
                ans = Math.max(ans, level);
            }
        }
        
        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }
}
