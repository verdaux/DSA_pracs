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

    public void insert(int index, int value)
    {

        if (index>=0 && index < length)
        {
            Node newNode = new Node(value);
            Node temp = head;
            if(index==0)
            {
                //call append
                newNode.next = head;
                head = newNode;
            }
            else if (index==length-1)
            {
                //call prepend
                tail.next = newNode;
                tail = newNode;
            }
            else
            {
                for (int curr = 0; curr < index - 1; curr++)
                {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
            length++;
        }
    }

    public Node removeAny(int index)
    {
        Node curr = head;
        if (length==0)
        {
            return null;
        }
        else if (length==1)
        {
            head=null;
            length=0;
            return curr;
        }
        else if (index==0)
        {
            //remove first
            head = head.next;
            length--;
            return curr;
        }
        else if (index==length-1)
        {
            while (curr.next!=tail)
            {
                curr = curr.next;
            }
            tail = curr;
            tail.next = null;
            length--;
        }
        else if (index>0 && index<length-1)
        {
            Node prev = head;
            curr = prev.next;
            for (int currentIndex=0;currentIndex<index-1;currentIndex++)
            {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            curr.next = null;
            length--;
            return curr;
        }
         return null;
    }

    public void reverse()
    {
        //swap head and tail
        Node temp = head;
        head = tail;
        tail = temp;

        //reversing the pointers
        Node before = null;
        Node after;
        for (int i = 0; i < length; i++)
        {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }

    public Node middleNode()
    {
        Node slow = head;
        Node fast = head;
        while (
                fast!=null
                &&
                        fast.next!=null
        )
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node kthNodeFromEnd(int kthIndex)
    {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < kthIndex; i++)
        {
            if (fast==null)
            {
                return null;
            }
            fast = fast.next;
        }

        while (fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public boolean hasLoop()
    {
        Node slow = head;
        Node fast = head;

        while (
                fast != null
                &&
                        fast.next!=null
                )
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    public void partitionList(int partitioner)
    {
        if (head==null)
        {
            return;
        }
        else
        {
            Node dummy1 = new Node(0);
            Node dummy2 = new Node(0);

            Node prev1 = dummy1;
            Node prev2 = dummy2;

            Node curr = head;

            while (curr!=null)
            {
                if(curr.value < partitioner)
                {
                    prev1.next = curr;
                    prev1 = curr;
                }
                else
                {
                    prev2.next = curr;
                    prev2 = curr;
                }
                curr = curr.next;
            }

            prev2.next = null;
            prev1.next = dummy2.next;
            head = dummy1.next;
        }

    }


}
