package LinkedListRepeated;

public class LinkedList
{
    private Node head;
    private Node tail;

    private int length;

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
        System.out.println("\nThe head node has the value:: "+(getHead()==null?"No header":getHead().value));
        System.out.println("\nThe tail node has the value:: "+(getTail()==null?"No Tail":getTail().value));
        System.out.println("\nThe LinkedList has below value(s)::\n");

        Node temp = head;

        while (temp!=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void append(int lastVal)
    {
        Node lastNode = new Node(lastVal);

        if (length>0)
        {
            tail.next = lastNode;
        }
        else
            head = lastNode;

        tail = lastNode;
        length++;
    }

    public void removeLast()
    {
        if (head==tail)
        {
            head = null;
            tail = null;
            length=0;
        }
        else if (length>1)
        {
            Node prev = head;
            Node temp = head.next;

            while (temp.next == tail)
            {
                prev = prev.next;
                temp = temp.next;
            }
            tail = prev;
            tail.next = null;
            length--;
        }
        else if (length==0)
        {
            System.out.println("Nothing to remove");
        }
    }
}
