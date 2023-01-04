package datastructures.Arrays;

public class MultipurposeArray
{
    private int initialCapacity;

    private int[] items;

    private int size;

    public MultipurposeArray(int initialCapacity)
    {
        this.initialCapacity = initialCapacity;
        items = new int[initialCapacity];
    }

    public void insertAtEnd(int value)
    {
        //if array capacity is full, resize it.
        if(items.length==size)
        {
            resize();
        }
        // Append the new value at the end.
        items[size++]=value;

    }

    public void resize()
    {
        //Create a new array with more size (capacity * 2)
        int[] newItems = new int[initialCapacity*2];

        //Copy all existing items
        for (int i=0; i < initialCapacity; i++)
        {
            newItems[i] = items[i];
        }
        //Set "items" to this new array
        items = newItems;
        initialCapacity=initialCapacity*2;
    }

    public int size() {
        return size;
    }

    public void print()
    {
        for(int i=0; i < size; i++)
        {
            System.out.println(items[i]);
        }
    }
}
