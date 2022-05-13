package com.compX;


public class present {
    public Node present_node(Node node,int val){
        if (node==null){
            System.out.println("Create a tree first...");
        }
        while (node!=null){
            if(val<node.data){
                node=node.left;
            }else if(val>node.data){
                node=node.right;
            }else{
                System.out.println("The node is present...");
                break;
            }
        }
        return node;
    }

    }

