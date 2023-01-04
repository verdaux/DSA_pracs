package datastructures.Arrays;

public class DynamicArray<String>
{
 private Object[] data;
 private int initialCapacity;
 private int size;

 public DynamicArray(int initialCapacity)
 {
     this.initialCapacity = initialCapacity;
     data = new Object[initialCapacity];
 }

 public String get(int index)
 {
     return (String) data[index];
 }

 public void set(int index, String value)
 {
     data[index] = value;
 }

 public void insert(int index, String value)
 {
    //check size
     if(size == initialCapacity)
     {resize();}
     //copy up data
     for(int j = size; j > index; j--)
     {
         data[j] = data[j-1];
     }
     //insert value
     data[index]=value;
     size++;
 }

 public void resize()
 {
     //increase size by twice the capacity
    Object[] resizedData = new Object[initialCapacity*2];

    //copy data of old array to the new array
    for(int i=0; i<initialCapacity;i++)
    {
        resizedData[i] = data[i];
    }

    //Set reference to point to new array
    data = resizedData;
    initialCapacity = initialCapacity*2;
 }

    public int size() {
        return size;
    }

 public void add(String value)
 {
     if(size==initialCapacity)
     {resize();}

     data[size] = value;
     size++;
 }

 public void delete(int index)
 {
    //copy down
    for (int j = index; j < size-1; j++)
    {
        data[j] = data[j+1];
    }
     //clear last element of array
    data[size - 1] = null;
     size--;
 }

 public void printArray()
 {
     for(int i=0; i< size; i++)
     {
         System.out.println("data at i :: "+data[i]);
     }
 }
}
