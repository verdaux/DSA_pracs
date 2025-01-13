package DSA.SinglyLinkedList;

public class LinkedList
{
    Node head;
    Node tail;
    int length;

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead()
    {
        return head;
    }

    public Node getTail()
    {
        return tail;
    }

    public int getLength()
    {
        return length;
    }

    public void printList()
    {
        Node curr = head;
        while (curr!=null)
        {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
    public void printAll()
    {
        System.out.println("All the values for the linked list are as follows:: ");
        System.out.println("head:: "+getHead().value);
        System.out.println("tail:: "+getTail().value);
        System.out.println("length:: "+getLength());
        System.out.println("Linked list values as follows::\n");
        printList();
    }
}
