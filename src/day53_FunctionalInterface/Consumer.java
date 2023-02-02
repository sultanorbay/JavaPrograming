package day53_FunctionalInterface;
@FunctionalInterface
public interface Consumer<T> {
    void  accept(T t);
}
