package day53_FunctionalInterface;
@FunctionalInterface
public interface BiFunction<T, U, R> {

  R apply(T t, U u);

}
