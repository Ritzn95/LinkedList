package com.Ritesh;

public class CLL {
    private ListNode head;
    private ListNode tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        ListNode node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        ListNode node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            ListNode n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }
        ListNode f = head;
        ListNode s = head;

        while (length > 0){
            s = s.next;
            length--;
        }
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }



    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
