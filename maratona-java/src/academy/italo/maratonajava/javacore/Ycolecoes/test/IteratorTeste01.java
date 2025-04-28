package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.*;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Italo");
        names.add("Sarah");
        names.add("Camilla");
        names.add("Karol Aguiar");
        names.add("Kaylane");

        //Causa erro removendo usando for each
//        for(String name: names){
//            if(name.equals("Camilla")){
//                names.remove(name);
//            }
//        }

        //Essa interface meio que vai checar antes de fazer alguma ação
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
          String name = namesIterator.next();
          if(name.equals("Camilla")){
              namesIterator.remove();
          }
        }
        //Podemos resumir isso em em linha:
        names.removeIf(name -> name.equals("Camilla"));

        System.out.println(names);
    }
}
