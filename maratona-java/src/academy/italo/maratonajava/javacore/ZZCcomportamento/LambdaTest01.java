package academy.italo.maratonajava.javacore.ZZCcomportamento;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    private static <T> void forEach(List<T> list, Consumer<T> comsumer) {
        for (T something : list) {
            comsumer.accept(something);
        }
    }

    public static void main(String[] args) {
        List<String> names = List.of("Italo", "Ana", "Sabrina");
        forEach(names, s -> System.out.println(s));
    }
}
