package DoublyLinkedList;

public class DoublyLinkedList
{
    Node head = null;
    Node tail = null;
    int length = 0;

    public DoublyLinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
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
        System.out.println("The linked list has following elements:: \n");
        Node curr = head;
        while (curr!=null)
        {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

    public void printAll()
    {
        System.out.println("Head node:: "+getHead().value);
        System.out.println("Tail node:: "+getTail().value);
        System.out.println("Length of linked list is:: "+getLength());
        printList();
    }

    public void append(int value)
    {
        Node lastNode = new Node(value);
        Node curr = head;
        if (length>0)
        {
            tail.next = lastNode;
            lastNode.prev = tail;
        }
        else
        {
            head = lastNode;
        }
        tail = lastNode;
        length++;
    }

    public Node removeLast()
    {
        Node nodeRemoved = tail;
        if (length>1)
        {

            tail = tail.prev;
            tail.next = null;
            nodeRemoved.prev = null;
            length--;
        }
        else if (length==1)
        {
            head = null;
            tail = null;
            length=0;
        }
        return nodeRemoved;
    }
}
