/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    // Recursive function to print right view of a binary tree.
    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
    
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        int currLevel = 0;
        while(!q.isEmpty()) {
            int n = q.size();
            
            if(currLevel == k) {
                for(int i = 0; i < n; i++){
                    ans.add(q.poll().data);                    
                }
                return ans;
            }
            
            for(int i = 0; i < n; i++){
                Node curr = q.poll();
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            currLevel++;
        }
        return ans;
    }
}
