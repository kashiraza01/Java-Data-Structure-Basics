import java.util.*;

class Node 
{
    int data;
    Node next;

    public Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList 
{
    Node head;

    public LinkedList() 
    {
        this.head = null;
    }

    public void insertAtBeginning(int data) 
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void display() 
    {
        Node current = head;

        if (current == null) 
        {
            System.out.println("Linked list is empty.");
            return;
        }

        System.out.print("Linked list = {");

        while (current != null) {
            System.out.print(current.data);
            if(current.next!=null)
            {
                System.out.print(" , ");
            }
            current = current.next;
        }

        System.out.print("}");
        System.out.println();
    }

    public void deleteNode(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != value) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
    }

}

public class Q1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Inserting Values 1,2 and 3");
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        System.out.println("LinkList before deleting a node is given as follows");
        linkedList.display();
        System.out.println("Deleting node having value 2");
        linkedList.deleteNode(2);
        System.out.println("Link List after deleting node is given as follows");
        linkedList.display();
    }
}
