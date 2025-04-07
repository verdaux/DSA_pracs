package Algorithms.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        /*int[] array1 = {1,3,7,8};
        int[] array2 = {2,4,5,6};*/

        int[] originalArray = {3,1,4,2};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "Original Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]

            Sorted Array: [1, 2, 3, 4]

         */

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */
    }

    public static int[] mergeSort(int[] arr)
    {
        if (arr.length==1) return arr;

        int midIndex = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr,midIndex,arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] arr1, int[] arr2)
    {
        int[] combined = new int[arr1.length+arr2.length];
        int index = 0;
        int i=0,j=0;

        while (i <arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                combined[index] = arr1[i];
                index++;
                i++;
            }
            else
            {
                combined[index] = arr2[j];
                index++;
                j++;
            }
        }

        while (i < arr1.length)
        {
            combined[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length)
        {
            combined[index] = arr2[j];
            index++;
            j++;
        }

        return combined;
    }
}
