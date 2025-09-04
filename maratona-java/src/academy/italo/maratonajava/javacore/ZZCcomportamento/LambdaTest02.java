package academy.italo.maratonajava.javacore.ZZCcomportamento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static<T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T e: list){
           R r = function.apply(e);
           result.add(r);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> name = List.of("Ben 10", "Gohan", "Goku");
        System.out.println(map(name,(String s) -> s.length()));
    }
}
