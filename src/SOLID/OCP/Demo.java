package SOLID.OCP;

import java.util.List;

public class Demo
{
    public static void main(String[] args)
    {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple,tree,house);

        ProductFilter prodFilt = new ProductFilter();
        prodFilt.filterByColor(products,Color.GREEN).map(p -> p.name).forEach(System.out::println);

        BetterFilter bf = new BetterFilter();
        ColorSpecification greenColorSpecification = new ColorSpecification(Color.GREEN);
        bf.filter(products,greenColorSpecification).map(p -> p.name).forEach(System.out::println);

        bf.filter(products, new AndSpecification<>(
                                                    new ColorSpecification(Color.GREEN)
                                                    ,new SizeSpecification(Size.LARGE)
                                                    ))
                .forEach(p -> System.out.println("Item is "+p.name+"\n Color is "+p.color+"\n And Size is "+p.size));
        ;

    }
}
