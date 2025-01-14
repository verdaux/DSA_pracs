package Algorithms.Sorting.bubbleSort;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {4,2,6,5,1,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] array)
    {
        //O(n)
        for (int i = array.length-1; i > 0; i--) //iterating the length of the array
        {
            //O(n)
            for (int j = 0; j < i; j++) // iterating each element for comparison
            {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
