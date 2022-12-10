package com.study.study04;

public class ReverseList {
    public static class Node{
        public int value;
        public Node next;

        public  Node(int value){
            this.value = value;
        }
    }
    //单链表反转
   public static Node reverseLinkedList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head = pre;
            pre = head;
            head = next;
        }
        return pre;
   }

   public static class DoubleNode {
       public int value;
       public DoubleNode last;
       public DoubleNode next;

       public DoubleNode(int value) {
           this.value = value;
       }
   }
        //双链表反转
   public static DoubleNode reverseDoubleLinkedList(DoubleNode head) {
            DoubleNode pre = null;
            DoubleNode next = null;
            while (head != null) {
                next = head.next;
                head.next = pre;
                head.last = next;
                pre = head;
                head = next;
            }
       return pre;
   }
   public static void printLinkedList(Node head) {
       System.out.println("LinkedList List: ");
       while (head != null) {
           System.out.print(head.value+" ");
           head = head.next;
       }
    }

    public static void printDoubleLinkedList(DoubleNode head){
        System.out.println("DoubleLinkedList List: ");
        DoubleNode end = null;
        //遍历next
        while (head != null) {
            System.out.print(head.value + " ");
            end = head;
            head = head.next;
        }
        System.out.print("| ");
        //再遍历last
        while (end != null){
            System.out.print(end.value + " ");
            end = end.last;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        printLinkedList(head1);
        head1 = reverseLinkedList(head1);
        printLinkedList(head1);

        DoubleNode head2 = new DoubleNode(1);
        head2.next = new DoubleNode(2);
        head2.next.last = head2;
        head2.next.next = new DoubleNode(3);
        head2.next.next.last = head2.next;
        head2.next.next.next = new DoubleNode(4);
        head2.next.next.next.last = head2.next.next;
        printDoubleLinkedList(head2);
        printDoubleLinkedList(reverseDoubleLinkedList(head2));
    }
}
