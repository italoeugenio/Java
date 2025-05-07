package academy.italo.maratonajava.javacore.ZGenerics.test.teste;

import academy.italo.maratonajava.javacore.ZGenerics.test.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComObjeto(new Boat("Canoa"));
    }


    private static <T> void criarArrayComObjeto(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }
}
