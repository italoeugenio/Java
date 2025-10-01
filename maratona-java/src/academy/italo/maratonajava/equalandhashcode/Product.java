package academy.italo.maratonajava.equalandhashcode;

import java.util.HashSet;
import java.util.Objects;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price , price) == 0 && product.name.equals(((Product) o).name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, price);
    }

    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();
        Product p1 = new Product("macbook", 5000.00);
        Product p2 = new Product("macbook", 5000.00);

        System.out.println(p1.equals(p2));
        products.add(p1);
        System.out.println(products.contains(p2));
    }
}
