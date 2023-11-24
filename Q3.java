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

    public void AddTohead(int data) 
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node detectCycle() 
    {
        if (head == null || head.next == null) 
        {
            return null;
        }

        Node A = head;
        Node B = head;

        while (B != null && B.next != null) 
        {
            A = A.next;
            B = B.next.next;

            if (A == B) {
                break;
            }
        }

        if (B == null || B.next == null) 
        {
            return null;
        }

        A = head;

        while (A != B) 
        {
            A = A.next;
            B = B.next;
        }

        return A;
    }
}

public class Q3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Create a linked list with a cycle
        linkedList.AddTohead(4);
        linkedList.AddTohead(3);
        linkedList.AddTohead(2);
        linkedList.AddTohead(1);
        linkedList.head.next.next.next.next = linkedList.head.next; // Creating a cycle

        Node cycleStart = linkedList.detectCycle();

        if (cycleStart != null) {
            System.out.println("Cycle exists. Starting node of the cycle starts at the node: " + cycleStart.data);
        } else {
            System.out.println("Cycle does not exist.");
        }
    }
}
