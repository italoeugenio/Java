package academy.italo.maratonajava.javacore.Ycolecoes.studies;

import java.util.*;

public class HashMapExercise {
    public static void contarCaracter(String word){
        Map<Character,  Integer> dic = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            Character letter = word.charAt(i);
            dic.put(word.charAt(i), dic.getOrDefault(word.charAt(i), 0) + 1);
        }

        System.out.println(dic);
    }

//    public static Character characterMaisRecente(String word){
//
//    }

    public static void main(String[] args) {
        String word = "banana";
        contarCaracter(word);
    }
}
