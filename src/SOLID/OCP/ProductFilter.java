package SOLID.OCP;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter
{
    public Stream<Product> filterByColor(
                                            List<Product> products, Color color
                                        )
    {
        return
                products
                        .stream()
                        .filter(prod -> prod.color == color)
                ;
    }

    public Stream<Product> filterBySize(
            List<Product> products, Size size
    )
    {
        return
                products
                        .stream()
                        .filter(prod -> prod.size == size)
                ;
    }

    public Stream<Product> filterBySize(
            List<Product> products, Size size, Color color
    )
    {
        return
                products
                        .stream()
                        .filter(prod -> prod.size == size && prod.color==color)
                ;
    }
}
