package datastructures.Arrays;

public class ResizableArray
{
    private int initialCapacity;
    private Object[] data;

    private int size;
    public ResizableArray(int initialCapacity)
    {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public void append(Object value)
    {
        //check size & resize if required
        if(data.length==size)
        {
            resizeAndCopy();
        }

        //append
        data[size++]=value;
    }

    public void resizeAndCopy()
    {
        Object[] newCopyOfOGArray = new Object[initialCapacity*2];

        for (int k = 0; k<initialCapacity;k++)
        {
            newCopyOfOGArray[k] = data[k];
        }

        data = newCopyOfOGArray;

        initialCapacity = initialCapacity*2;
    }

    public void insertAtIndex(int index, Object value)
    {
        if (data.length==initialCapacity)
        {resizeAndCopy();}

        for (int j=size;j>index;j--)
        {
            data[j]=data[j-1];
        }

        data[index]=value;
        size++;
    }

    public void removeAt(int index)
    {

        //copy down array - left shift all elements till the index
        for (int i=index;i<size-1;i++)
        {
            data[i] = data[i+1];
        }

        //set last element to null - before reducing the size
        data[size-1]=null;
        size--;
    }

    public void printArray()
    {
        for (int i=0; i< size;i++)
        {
            System.out.println(data[i]);
        }
    }
}
