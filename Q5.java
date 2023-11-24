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
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
        LinkedList list = new LinkedList();
        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while (temp1 != null && temp2 != null)
        {
            if (temp1.data <= temp2.data)
            {
                list.AddTohead(temp1.data);
                temp1 = temp1.next;
            } 
            else 
            {
                list.AddTohead(temp2.data);
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) 
        {
            list.AddTohead(temp1.data);
            temp1 = temp1.next;
        }

        while (temp2 != null) 
        {
            list.AddTohead(temp2.data);
            temp2 = temp2.next;
        }

        return list;
    }

    public void display() 
    {
        Node current = head;

        if (current == null) 
        {
            System.out.println("Linked list is empty.");
            return;
        }

        System.out.print("Linked list: ");

        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class Q5 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.AddTohead(5);
        list1.AddTohead(3);
        list1.AddTohead(1);

        LinkedList list2 = new LinkedList();
        list2.AddTohead(6);
        list2.AddTohead(4);
        list2.AddTohead(2);

        LinkedList list = LinkedList.mergeSortedLists(list1, list2);
        list.display();
    }
}
