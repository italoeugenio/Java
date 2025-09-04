package academy.italo.maratonajava.javacore.ZZAclassesinternas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Car", 20000));
        productList.add(new Product("Iphone 13", 2300));
        productList.add(new Product("Iphone 16", 8500));
        productList.add(new Product("Iphone 14", 3000));
    }
}
