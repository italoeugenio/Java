package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(50);
        number.add(41);
        number.add(20);
        number.add(12);

        Collections.sort(number);
        System.out.println(number);
        System.out.println( Collections.binarySearch(number,20));
    }
}
