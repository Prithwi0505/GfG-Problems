/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        Node mechanic = head;
        Node helper = null;
        while(mechanic != null){
            Node temp = mechanic.next;
            mechanic.next = helper;
            helper = mechanic;
            mechanic = temp;
        }
        return helper;
    }
}