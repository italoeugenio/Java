package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.*;

public class JavaCollection {
    public static void main(String[] args) {
        //Map - dicionários
        //Set - não permite duplicatas
        //List - permite elementos duplicados
        // Queue - Processamento em ordem

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Italo");
        list.add("Santana");
        list.add("Italo");

        Set<String> setStrings = new HashSet<>();
        setStrings.add("Hello");
        setStrings.add("Italo");
        setStrings.add("Santana");
        setStrings.add("Italo");

        System.out.println("List: " + list);
        System.out.println("Set: " + setStrings.contains("Italo"));

        Map<String, String> map = new HashMap<>();
        map.put("name", "Italo");
        map.put("surname", "Santana");

        System.out.println(map.get("teste"));

        Queue<String> queue = new LinkedList<>();
         queue.add("Italo");
         queue.add("Santana");

        System.out.println(queue.peek());
        System.out.println("Queue: " + queue.poll()); //Pega e remove o valor
        System.out.println(queue);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }
}
