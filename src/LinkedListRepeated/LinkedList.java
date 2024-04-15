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

    public Node removeLast()
    {
        Node prev = head;
        if (head==tail)
        {
            head = null;
            tail = null;
            length=0;
        }
        else if (length>1)
        {

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
        return prev;
    }

    public void addMiddle(int index, int value)
    {
        Node midNode = new Node(value);

        if (length==0)
        {
            head = midNode;
            tail = midNode;
        }
        else
        {
            Node temp = head.next;

            for (int i = 0; i < (index-1);i++)
            {
                temp = temp.next;
            }
            midNode.next = temp.next;
            temp.next = midNode;
            length++;
        }
    }

    public void prepend(int value)
    {
        Node firstNode = new Node(value);

        if(length==0)
        {
            head = firstNode;
            tail = firstNode;
        }
        else
        {
            firstNode.next = head;
            head = firstNode;
        }
        length++;
    }

    public Node removeFirst()
    {
        Node temp = head;
        if (length==0)
        {
            return null;
        }
        else if (length==1)
        {
            head = null;
            tail = null;
            length=0;
            return temp;
        }
        else if (length==2)
        {
            head = tail;
            length=1;
            return temp;
        }
        else
        {
            head = head.next;
            length--;
            return temp;
        }
    }

    public Node remove(int index)
    {
        if (index==0)
        {
            return  removeFirst();
        }
        else if (index==length-1)
        {
            return removeLast();
        }
        else if (length>2)
        {
            Node prev = head;
            Node temp = head;
            for (int i=0; i < index; i++)
            {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            length--;
            return temp;
        }
        else
            return null;
    }

    public Node get(int index)
    {
        if(index<0 || index>length)
        {
            System.out.println("The index provided was not found");
            return null;
        }
        else if (index == 0)
        {
            return getHead();
        }
        else if (index == length-1)
        {
            return getTail();
        }
        else
        {
            Node temp=head;
            for (int i = 0; i <= index-1;i++)
            {
                temp = temp.next;
            }
            return temp;
        }
    }

    public void reverse()
    {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i =0; i < length; i++)
        {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void set(int value, int index)
    {

        Node temp = head;
        for (int i=0; i <=index-1;i++)
        {
            temp = temp.next;
        }

        temp.value = value;

    }
}
