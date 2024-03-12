package LinkedListRepeated;

public class LinkedList
{
    private Node head;
    private Node tail;

    private int length;

    public int getHead()
    {
        return head.value;
    }

    public int getTail()
    {
        return tail.value;
    }

    public int getLength()
    {
        return length;
    }
    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList()
    {
        System.out.println("\nThe length of the LinkedList is:: "+getLength());
        System.out.println("\nThe head node has the value:: "+getHead());
        System.out.println("\nThe tail node has the value:: "+getTail());
        System.out.println("\nThe LinkedList has below value(s)::"+getTail());

        Node temp = head;
        while (temp!=tail.next)
        {
            System.out.println(head.value);
            temp = temp.next;
        }
        System.out.println("\n");
    }
}
