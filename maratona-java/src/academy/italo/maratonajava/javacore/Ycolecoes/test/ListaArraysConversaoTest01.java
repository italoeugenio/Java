package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArraysConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);

        Integer[] listToArray = number.toArray(new Integer[0]); // podemos usar number.size, porém quando usamos o 0 ele tem um desempenho mellhor
        System.out.println(Arrays.toString(listToArray));

        Integer[] numberArray = new Integer[3];
        numberArray[0] = 1;
        numberArray[1] = 2;
        numberArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numberArray); //asList criar um conexão com o array original
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numberArray));
        System.out.println(arrayToList);

        System.out.println("------- como poder fazer alterações -------");
        List<Integer> numberList = new ArrayList<>(Arrays.asList(numberArray));
        numberList.add(55);
        System.out.println(numberList);
    }
}
