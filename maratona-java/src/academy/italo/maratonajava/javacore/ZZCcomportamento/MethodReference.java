package academy.italo.maratonajava.javacore.ZZCcomportamento;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Conversor {
    public static String formatarID(Integer num){
        return "ID-" + num;
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bia", "Italo");
//        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::print);
        //Parte
        List<Integer> nums = Arrays.asList(102,103,104);
        List<String> ids = nums.stream()
                .map(num -> Conversor.formatarID(num))
                .collect(Collectors.toList());

        System.out.println(ids);

        //Desafio: Crie uma nova lista que contenha apenas os números pares.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> EvenNum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        List<Integer> powTwo = numbers.stream()
                .map(num -> num * num)
                .toList();

        System.out.println(powTwo);
    }
}
