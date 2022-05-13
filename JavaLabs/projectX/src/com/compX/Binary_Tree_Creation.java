package com.compX;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree_Creation {
    public Node Insert(Node node,int val){//this function inserts nodes in the tree
        if(node==null){//if the tree is empty it sends you to create new function
            return CreateNewNode(val);
        }
        if (val<node.data) {//if the number entered is less than the tree node it goes to the left of the tree
            node.left = Insert(node.left, val);
        }
        else if(val>node.data){//else it is sent to the right
            node.right=Insert(node.right,val);
        }
        return node;
    }
    public Node CreateNewNode(int K) {// this function helps to create the tree node
        Node a = new Node();
        a.data = K;
        a.left = null;
        a.right = null;
        return a;
    }


    public void inorder(Node node){//this function prints out the tree using inorder traversal
        if (node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data+" ");
        inorder(node.right);
    }
    public void preorder(Node node){//this function prints out the tree using preorder traversal
        if (node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(Node node){//this function prints out the tree using postorder traversal
        if (node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }


    int count=0;
    public Node zth_class(Node node, int z) {//this function prints the zth largest number
        if (node==null){
            return null;
        }
        Node right=zth_class(node.right,z);
        if (right!=null){
            return right;
        }
        count++;
        if(count==z){
            return node;
        }
        return zth_class(node.left,z);
    }

    public int get_max(Node node) {//this function gets the maximum value
        if (node == null) {
            System.out.print("this tree is empty");
            return -1;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }
    public int get_min(Node node) {//this function gets the minimum value
        if (node == null) {
            System.out.print("this tree is empty");
            return -1;
        }
        while (node.right != null) {
            node = node.left;
        }
        return node.data;
    }

    public void breadth_search(Node node){//Displays the tree starting from the first level to the last
        Queue<Node> d=new LinkedList<Node>();
        d.add(node);//take the node and add it to the quee
        while (!d.isEmpty()){
            node=d.remove();//take particular node
            System.out.print(node.data+" ");//print the particular node
            if (node.left!=null)// if the left node is not null it goes to the quee
                d.add(node.left);
            if(node.right!=null)//if the right node is not null it goes to the quee
                d.add(node.right);
        }
    }
    public void depth_search(Node node){// displays the tree uding depth search
        if (node==null){
            return;
        }
        System.out.print(node.data+" ");
        depth_search(node.left);
        depth_search(node.right);
    }
}


