package LinkedListPractice;

public class LinkedList
{
    private Node head;
    private Node tail;
    private int length;
    public LinkedList(int value)
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
        Node temp = head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll()
    {
        if(length==0)
        {
            System.out.println("The linked list is empty");
        }
        else
        {
            System.out.println("\nThe head element has value:: "+getHead().value);
            System.out.println("The tail element has value:: "+getTail().value);
            System.out.println("The length of the linked list is:: "+getLength());

            System.out.println("The elements of linked list are as follows: \n");
            printList();
        }
    }

    public void prepend(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst()
    {
        if(length==0)
        {
            return null;
        }
        else
        {
            Node temp = head;
            head = head.next;
            length--;
            temp.next=null;
            return temp;
        }
    }

    public void append(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast()
    {
        Node prev = head;
        if (length==0)
        {
            return null;
        }
        else if (length==1)
        {
            head = null;
            tail = null;
            length=0;
            return prev;
        }
        else
        {
            Node temp = head.next;

            while(temp.next!=null)
            {
                prev = temp;
                temp = temp.next;
            }
            tail = prev;
            tail.next=null;
            length--;
            return temp;
        }
    }

    public Node get(int index)
    {
        if(index<0 || index>length)
        {
            return null;
        }
        else
        {
            Node temp = head;
            for (int i=0;i<index;i++)
            {
                temp = temp.next;
            }
            return temp;
        }
    }

    public boolean set(int index, int value)
    {
        if(index<0 || index>length)
        {
            return false;
        }
        else if (length==0)
        {
            prepend(value);
            return true;
        }
        else if (index==0)
        {
                head.value = value;
                return true;
        }
        else
        {
            Node temp = head;


            for (int i=0;i<index;i++)
            {
                temp = temp.next;
                if(i == index-1)
                {
                    temp.value = value;
                }
            }
            return true;
        }
    }

    public boolean insert(int index, int value)
    {
        if (length==0)
        {
            prepend(value);
            return  true;
        }
        else if(index<0 || index>length)
        {
            return  false;
        }
        else if (index==length)
        {
            append(value);
            return true;
        }
        else
        {
            Node newNode = new Node(value);
            Node temp = head;
            for(int i = 0; i < (index-1); i++)
            {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }

    }

    public Node remove(int index)
    {
        if (length==0)
        {
            return null;
        }
        else if(index<0 || index>=length)
        {
            return  null;
        }
        else if (index==0)
        {
            return removeFirst();
        }
        else if (index==length-1)
        {
            return removeLast();
        }
        else
        {
            Node prev = head;
            Node temp = head.next;

            for(int i = 0; i < (index-1); i++)
            {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            //prev = temp;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public void reverse()
    {
        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after = temp.next;

        while(temp!=null)
        {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
