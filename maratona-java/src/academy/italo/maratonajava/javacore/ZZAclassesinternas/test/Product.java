package academy.italo.maratonajava.javacore.ZZAclassesinternas.test;

import java.util.Comparator;

public class Product {
    private String itemName;
    private Integer price;

    public Product(){}

    public Product(String itemName, Integer price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return "Product{" +
//                "itemName='" + itemName + '\'' +
//                ", price=" + price +
//                '}';
//    }

//    @Override
//    public int compare(Product o1, Product o2) {
//        return this.price.compareTo(other.getPrice());
//    }
}
