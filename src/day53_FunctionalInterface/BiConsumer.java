package day53_FunctionalInterface;
@FunctionalInterface
public interface BiConsumer<T,U> {

    void  accept(T t, U u);
}
