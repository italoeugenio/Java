package academy.italo.maratonajava.javacore.ZGenerics.teste;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        lista.add("ste");
        lista.add(3);
        lista.add(true);

        for(Object elements: lista){
            if(elements instanceof Boolean){
                System.out.println(elements);
            }
        }
    }
}
