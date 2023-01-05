package General;

import java.util.List;
import java.util.stream.Collectors;

public class DataTypeTest
{
    public static void main(String[] args)
    {
        DataTypeTest dt = new DataTypeTest();
        dt.print(1,2);

        List<Integer> listWithDuplicates = List.of(5, 0, 3, 1, 2, 3, 0, 0);
        List<Integer> listWithoutDuplicates = listWithDuplicates.stream().distinct().collect(Collectors.toList());
    }

    public void print(int i, double d)
    {
        System.out.println("int first:: "+i+ " double second "+d);
    }

//    public void print( double d,int i)
//    {
//        System.out.println("double first:: "+i+ "int second "+d);
//    }
}
