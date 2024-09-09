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
        if(getLength()>0)
        {
            System.out.println("The linked list has following elements:: \n");
            Node curr = head;
            while (curr != null)
            {
                System.out.println(curr.value);
                curr = curr.next;
            }
        }
    }

    public void printAll()
    {
        System.out.println(getHead()!=null?"Head node:: "+getHead().value:"head is null");
        System.out.println(getTail()!=null?"Tail node:: "+getTail().value:"tail is null");
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

    public void prepend(int value)
    {
        Node firstNode = new Node(value);
        if(length>0)
        {
            head.prev = firstNode;
            firstNode.next = head;
            head = firstNode;
        }
        else
        {
            head = firstNode;
            tail = firstNode;
        }
        length++;
    }

    public Node removeFirst()
    {
        Node firstRemoveCandidate = head;
        if (length>1)
        {
            head = head.next;
            head.prev = null;
            firstRemoveCandidate.next = null;
            length--;
        }
        else if (length==1)
        {
            head = null;
            tail = null;
            length=0;
        }
        return firstRemoveCandidate;
    }

    public Node get(int index)
    {
        Node currNode = head;
        if (index>=0 && index < length)
        {
            if (index<length/2)
            {for (int i = 0; i < index; i++)
            {
                currNode = currNode.next;
            }}
            else
            {
                currNode = tail;
                for (int i = length-1; i > index;i--)
                {
                    currNode = currNode.prev;
                }
            }
        }
        return currNode;
    }

    public void set(int index, int value)
    {
        get(index).value = value;
    }
}
