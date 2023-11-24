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

    public void reverseIterative() 
    {
        System.out.println("Reversing Linklist Iteratively");
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void reverseRecursive() 
    {
        head = reverseUtil(head, null);
    }

    private Node reverseUtil(Node current, Node prev) 
    {
        if (current == null) 
        {
            return prev;
        }

        Node next = current.next;
        current.next = prev;

        return reverseUtil(next, current);
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

        while (current != null) 
        {
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
}

public class Q2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        linkedList.display();

        linkedList.reverseIterative();
        linkedList.display();

        linkedList.reverseRecursive();
        linkedList.display();
    }
}
