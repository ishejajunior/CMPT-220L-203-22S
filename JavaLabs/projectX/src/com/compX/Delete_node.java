package com.compX;

public class Delete_node extends Binary_Tree_Creation {
    public Node Delete(Node node, int val) {// this is the function that helps to delete
        if (node == null) {
            return null;
        }
        if (val < node.data) {
            node.left = Delete(node.left, val);
        } else if (val > node.data) {
            node.right = Delete(node.right, val);
        } else {
            if (node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;
                return temp;
            } else {//inorder succesor
                Node succesor = getSuccesor(node);
                node.data = succesor.data;
                node.right= Delete(node.right,4);
                return node;
            }
        }
                return node;
            }
            public Node getSuccesor(Node node){// this function helps to determine the best fit to replace the deleted value
        if (node==null){
            return null;
        }
        Node temp = node.right;
        while (temp != null){
            temp=temp.left;
        }
return temp;
    }
}