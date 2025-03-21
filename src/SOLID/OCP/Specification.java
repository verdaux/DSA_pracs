package SOLID.OCP;

public interface Specification<T>
{
    boolean isSatisfied(T item);
}
