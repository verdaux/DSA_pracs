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

    public void append(int val)
    {
        Node newNode = new Node(val);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast()
    {
        Node temp = head;
        Node pre = head;
        if(length==0)
        {return null;}
        else
        {
            while(temp.next != null)
            {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next=null;
            length--;
            if(length==0)
            {head = null;
            tail = null;}
            return temp;
        }




    }

    public void prepend(int val)
    {
        Node firstNode = new Node(val);
        if(length==0)
        {
            tail=firstNode;
            head=firstNode;
        }
        else
        {
            firstNode.next = head;
            head = firstNode;
        }
    length++;
    }

    public Node removeFirstAlt()
    {
        if(length==0)
        {return null;}
        Node temp = head;
        head = head.next;
        temp.next=null;
        length--;
        if(length==0)
        {tail= null;}
        return temp;
    }

    public Node removeFirst()
    {
        if(length==0)
        {
            return null;
        }
        else if(length==1)
        {
            head=null;
            tail=null;
            length--;
        }
        else
        {head = head.next;
            length--;
        }
        return head;
    }

    public Node get(int index)
    {
        Node indexNode = head;
        if(index<0 || index>length)
        {
            return null;
        }
        else
        {
            for (int i = 0; i <index;i++)
            {
                indexNode = indexNode.next;
            }

        }


        return indexNode;
    }

    public boolean set(int index, int val)
    {
        Node temp = head;
        if(index<0 || index>length)
        {
            return false;
        }
        else
        {
            for (int i = 0; i < index; i++)
            {
                temp = temp.next;
                if(i==(index-1))
                {
                    temp.value = val;
                }
            }
        }
        return true;
    }

    public boolean insert(int index, int val)
    {
        if(index<0 || index>length)
        {return false;}

        else if (index==0)
        {
            prepend(val);
            return true;
        }
        else if (index==length)
        {
            append(val);
            return true;
        }
        else
        {
            Node newNode = new Node(val);
            Node temp = head;
            for (int i = 0; i < (index-1); i++)
            {
                temp = temp.next;
            }
            newNode.next = temp.next ;
            temp.next = newNode;
            length++;

            return true;
        }


    }

    public Node remove(int index)
    {
        if(index < 0 || index > length)
        {return null;}
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
            Node prev = get(index - 1);
            Node temp = prev.next;

            prev.next = temp.next;
            temp.next = null;
            length--;
            return  temp;
        }

    }

    public void printLL()
    {
        Node temp = head;
        System.out.println("\n Printing LinkedList ::");
        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void reverse()
    {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0 ; i <length;i++)
        {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void getHead()
    {
        System.out.println(length==0?"Head is empty":"Head is :: "+head.value);
    }

    public void getTail()
    {
        System.out.println(length==0?"Tail is empty":"Tail is :: "+tail.value);
    }

    public void getLength()
    {
        System.out.println("Total length of the LinkedList is:: "+length);
    }
}
