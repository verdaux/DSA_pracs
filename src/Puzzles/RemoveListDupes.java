package Puzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveListDupes
{
    public static void main(String[] args)
    {
        RemoveListDupes rld = new RemoveListDupes();
        List<Integer> list = List.of(5,7,8,1,4,6,2,5,10,8,1);
        rld.removeDupes(list);
    }

    public void removeDupes(List<Integer> list)
    {
        list
                .stream()
                .distinct()
                .collect(Collectors.toList())
                //.toList()
                .forEach(System.out::println);
    }
}
