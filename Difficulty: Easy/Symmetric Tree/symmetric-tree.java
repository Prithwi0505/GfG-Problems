/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean check(Node p, Node q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.data != q.data) return false;
        boolean r1 = check(p.left, q.right);
        boolean r2 = check(p.right, q.left);
        return r1 && r2;
    }
    public boolean isSymmetric(Node root) {
        Node p = root.left;
        Node q = root.right;
        return check(p, q);
    }
}