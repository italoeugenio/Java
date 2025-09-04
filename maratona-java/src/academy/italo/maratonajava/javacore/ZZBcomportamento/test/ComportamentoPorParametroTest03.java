package academy.italo.maratonajava.javacore.ZZBcomportamento.test;

import academy.italo.maratonajava.javacore.ZZBcomportamento.interfaces.EvenNum;

import java.util.List;
import java.util.*;

public class ComportamentoPorParametroTest03 {
    public static List<Integer> evenNumbers(List<Integer> arrs, EvenNum evenNum){
        List<Integer> filter = new ArrayList<>();
        for(int arr: arrs){
            if(evenNum.isEven(arr)){
                filter.add(arr);
            }
        }
        return  filter;
    }

    public static void main(String[] args) {
        List<Integer> Listnum = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(evenNumbers(Listnum, num -> num % 3 == 0));
    }
}
