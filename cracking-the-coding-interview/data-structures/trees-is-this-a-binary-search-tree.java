/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    Node prev = null;
    boolean checkBST(Node node) {
        if (node != null)
        {
            if (!checkBST(node.left)) return false;
            if (prev != null && node.data <= prev.data ) return false;
            prev = node;
            return checkBST(node.right);
        }
        return true;
    }
