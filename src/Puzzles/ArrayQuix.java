package Puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayQuix
{
    public static void main(String[] args)
    {
        int[] arr = {123, 456, 789, 45, 440, 4500, 440};

        List<Integer> list = Arrays.
                stream(arr)
                .boxed()
                .collect(Collectors.toList())
                ;
    }
}
