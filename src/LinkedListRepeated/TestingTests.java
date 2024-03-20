package LinkedListRepeated;

public class TestingTests
{
    public static void main(String[] args)
    {
        String s1 = "Meenu";
        String s2 = "Meenu";
        String s3 = "Sonu";

        s1 = new String("Sonu");

        System.out.println("equal"+s1.equals(s3));
        System.out.println("now new equals");
        System.out.println(s1 == s3);
    }
}
