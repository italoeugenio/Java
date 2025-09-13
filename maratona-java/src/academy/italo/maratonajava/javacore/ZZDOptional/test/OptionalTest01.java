package academy.italo.maratonajava.javacore.ZZDOptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("O italo é foda");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        Optional<String> name = Optional.ofNullable(findName("Italo"));
        name.orElse("Else do optional");
        System.out.println(name);

    }

    private static String findName(String name){
        List<String> list = List.of("Italo", "Ana", "Joao", "Kaylane");
        int i = list.indexOf(name);
        if(i > -1){
            return list.get(i);
        }
        return null;
    }
}
