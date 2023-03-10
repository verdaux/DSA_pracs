package datastructures.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest
{
    private DynamicArray array;

    @Before
    public void setUp()
    {
        array = new DynamicArray<String>(2);
    }

    @Test
    public void setAndGet()
    {
        array.set(0,"a");
        Assert.assertEquals("a",array.get(0));
    }

    @Test
    public void Insert() {
        array.add("a"); // 0
        array.add("b"); // 1
        array.add("c"); // 2

        array.insert(1, "d");

        Assert.assertEquals(4, array.size());
        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("d", array.get(1));
        Assert.assertEquals("b", array.get(2));
        Assert.assertEquals("c", array.get(3));
    }

    @Test
    public void DeleteFirst() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(0);

        Assert.assertEquals(2, array.size());
        Assert.assertEquals("b", array.get(0));
        Assert.assertEquals("c", array.get(1));
        Assert.assertEquals(null, array.get(2));
    }
}
