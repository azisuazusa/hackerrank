/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  var Node = function(data) {
    this.data = data;
    this.next = null;
  }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function insert(head, data, position) {
    if (head == null) {
        head = new Node(data);
        head.data = data;
        head.next = null;
    } else {
        if(position == 0) {
            let n = new Node(data);
            n.next = head;
            head = n;
        } else {
            let count = 0;
            let curr = head;
            let prev = head;
            while(count !== position) {
                prev = curr
                curr = curr.next;
                count++;
            }
            let n = new Node(data);
            n.next = curr;
            prev.next = n;
        }
    }
    return head;
}
