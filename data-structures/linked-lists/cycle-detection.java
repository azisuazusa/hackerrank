/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head == null) {
        return false;
    } else {
        Node newNode = head;
        Node cutNode = head;
        int count = 0;
        while(true) {
            newNode = newNode.next;
            count++;
            if(newNode == null) {
                return false;
            } else {
                for(int i = 0; i < count; i++) {
                    if(cutNode == newNode) {
                        return true;
                    } else {
                        cutNode = cutNode.next;
                    }
                }
            }
            cutNode = head;
        }
    }
}
