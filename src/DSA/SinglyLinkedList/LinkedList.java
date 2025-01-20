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
        System.out.println("head:: "+(getHead()!=null?getHead().value:"is null"));
        System.out.println("tail:: "+(getTail()!=null?getTail().value:"is null"));
        System.out.println("length:: "+getLength());
        System.out.println("Linked list values as follows::\n");
        printList();
    }

    public void append(int value)
    {
        Node lastNode = new Node(value);
        if(length>0)
        {tail.next = lastNode;}
        else
        {
            head = lastNode;
        }
        tail = lastNode;
        length++;
    }

    public Node removeLast()
    {
        Node temp = head;
        if (length>1)
        {
            while (temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            length--;
        }
        else if (length==1)
        {
            head = null;
            tail = null;
            length = 0;
        }
        return temp;
    }

    public void prepend(int value)
    {
        Node headNode = new Node(value);
        if (length==0)
        {
            head = headNode;
            tail = headNode;
        }
        else
        {
            headNode.next = head;
            head = headNode;
        }
        length++;
    }

    public Node removeFirst()
    {
        Node temp = head;
        if(length>1)
        {
            head = head.next;
            temp.next = null;
            length--;
        }
        else if (length==1)
        {
            head = null;
            tail = null;
            length = 0;
        }
        return temp;
    }

    public Node get(int index)
    {
        Node temp = head;
        if (index>=0 && index<length)
        {
            for (int i=0; i < index; i++)
            {
                temp = temp.next;
            }
        }
        else
            return null;
        return temp;
    }

    public void set(int index, int value)
    {
        Node temp = head;
        if (index >=0 && index<length)
        {
            for (int curr = 0; curr < index; curr++)
            {
                temp = temp.next;
            }
            System.out.println("value of curr node is:: "+temp.value);
            temp.value = value;
        }
    }
}
