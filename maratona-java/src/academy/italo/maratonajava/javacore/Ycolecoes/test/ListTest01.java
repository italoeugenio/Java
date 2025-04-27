package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList(16);
        names.add("Italo");
        names.add("Edrick");

        for(String name: names){
            System.out.println(name);
        }

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
