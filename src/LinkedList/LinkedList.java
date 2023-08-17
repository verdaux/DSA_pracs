package LinkedList;

public class LinkedList
{
    private Node head;
    private Node tail;

    private int length;
    public LinkedList(int value)
    {
        Node brandNewNode = new Node(value);
        head = brandNewNode;
        tail = brandNewNode;
        length = 1;
    }

    public void append()
    {}

    public void prepend()
    {}

    public void insert()
    {}

    public void printLL()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead()
    {
        System.out.println(head.value);
    }

    public void getTail()
    {
        System.out.println(tail.value);
    }

    public void getLength()
    {
        System.out.println(length);
    }
}
