package datastructurealgo.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        // Display the list
        System.out.println( "Linked List:");
        list.display();

        // Delete a node
        list.delete(20);
        System.out.println( "After Deletion:");
        list.display();
    }
}

class Node{
    int data; // data to store
    Node next; // pointer to next node

    // constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head; // head of the list

    // Method to insert a new node at the end
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the list
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int data){
        if(head == null) return; // list is empty
        if(head.data == data){ // Delete the head node
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }else {
            System.out.println("Data not found");
        }
    }

}
