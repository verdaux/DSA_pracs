package SOLID.LSP;

public class Demo
{
    static void useIt(Rectangle r)
    {
        int width = r.getWidth();
        r.setHeight(10);
        //area width * 10
        System.out.println("expected area:: "+(width*10));
        System.out.println("actual area:: "+r.getArea());
    }

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(2,3);

        useIt(r);

        Rectangle sq = new Square();
        sq.setWidth(5);
        useIt(sq);

        useIt(RectangleFactory.newRectangle(2,3));
        useIt(RectangleFactory.newSquare(5));
    }
}
