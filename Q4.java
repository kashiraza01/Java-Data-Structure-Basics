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

    public Node findMiddleNode() 
    {
        if (head == null) 
        {
            return null;
        }

        Node Temp1 = head;
        Node Temp2 = head;

        while (Temp2 != null && Temp2.next != null) 
        {
            Temp1 = Temp1.next;
            Temp2 = Temp2.next.next;
        }

        return Temp1;
    }
}

public class Q4 
{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(6);
        linkedList.insertAtBeginning(5);
        linkedList.insertAtBeginning(4);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        Node middleNode = linkedList.findMiddleNode();

        if (middleNode != null) {
            System.out.println("Middle node: " + middleNode.data);
        } else {
            System.out.println("List is empty.");
        }
    }
}
