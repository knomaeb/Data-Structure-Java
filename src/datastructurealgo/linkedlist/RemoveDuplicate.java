package datastructurealgo.linkedlist;

import java.util.HashSet;

class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}


public class RemoveDuplicate {

    // Solution 1: Using a HashSet (temporary buffer)
    public static ListNode removeDuplicateWithBuffer(ListNode head){
        if (head == null){
            return null;
        }

        HashSet<Integer> seen = new HashSet<>();
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                previous.next = current.next; // Remove the duplicate
            } else {
                seen.add(current.data);
                previous = current; // Move previous only when no duplicate
            }
            current = current.next;
        }

        return head;
    }

    // Solution 2: Without a temporary buffer (using two pointers)
    public static ListNode removeDuplicatesNoBuffer(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        while (current != null) {
            ListNode runner = current; // Runner starts from current
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next; // Remove the duplicate
                } else {
                    runner = runner.next; // Move runner only when no duplicate
                }
            }
            current = current.next;
        }

        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args){
        // Example 1: With Buffer
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(1);

        System.out.println("Original list (with buffer):");
        printList(head1);

        ListNode result1 = removeDuplicateWithBuffer(head1);

        System.out.println("List after removing duplicates (with buffer):");
        printList(result1);

        // Example 2: Without Buffer
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(2);
        head2.next.next.next.next = new ListNode(4);
        head2.next.next.next.next.next = new ListNode(1);

        System.out.println("\nOriginal list (without buffer):");
        printList(head2);

        ListNode result2 = removeDuplicatesNoBuffer(head2);

        System.out.println("List after removing duplicates (without buffer):");
        printList(result2);
    }
}
