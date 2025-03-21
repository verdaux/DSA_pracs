package SOLID.LSP;

public class Rectangle
{
    protected int height,width;

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public Rectangle()
    {
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getArea()
    {
        return width*height;
    }

    @Override
    public String toString()
    {
        return "Rectangle{"
                +"width="+width
                +", height="+height
                +"}"
                ;
    }

    public boolean isSquare()
    {
        return width==height;
    }
}
