package com.company;

public class Node {
     Node top=null;
     Node bottom=null;

    public void addbotom(int number){
        Node newnNode=new Node(number);

        if (top==null){
            top=newnNode;
            bottom=newnNode;
        }
        else {
            bottom.next=newnNode;
            bottom=newnNode;
        }
    }

    public void output(){
        while(current!=null){
            Node current = top;
            System.out.print(current.number);
            current = current.next;
        }
    }
    Void Delete(int position){
        if(top==null) {
            return;

            Node temp = top;
            return;
        }
        for(int i=0;temp != null && i< position -1; i++)
            temp = temp.next;

        Node next=temp.next.next;
        temp.next=next;
    }
}
