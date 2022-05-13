package com.compX;

 class Main { //main class
    public static void main(String[] args) {
        Binary_Tree_Creation a = new Binary_Tree_Creation();//creates an object that will help to create node
        Node root= null;

        root =  a.Insert(root,2);
        root =  a.Insert(root,30);
        root =  a.Insert(root,10);
        root =  a.Insert(root,9);
        root =  a.Insert(root,8);
        root =  a.Insert(root,80);
        root =  a.Insert(root,310);
        root =  a.Insert(root,1);

        System.out.println("Inorder:");
        a.inorder(root);
        System.out.println(" preorder:");
        a.preorder(root);
        System.out.println(" postorder:");
        a.postorder(root);
        System.out.println(" maximum value:"+a.get_max(root));
        System.out.println(" min value:"+a.get_min(root));
        System.out.println("Breadth search :");
        a.breadth_search(root);
        System.out.println("Depth search:");
        a.depth_search(root);
        Node Zth= a.zth_class(root,3);
        System.out.println("Zth number:"+Zth.data);

    }
}
