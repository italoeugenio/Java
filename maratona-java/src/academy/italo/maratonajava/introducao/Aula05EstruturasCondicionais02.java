package academy.italo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //age < 15  category children's
        //age >= 15 && age < 18 category juvenile
        //age >= 18 category adult

        System.out.print("Write your age:");
        int age = scan.nextInt();

        String category;

        if(age >= 18){
            category = "You are adult";
        } else if (age >= 15 && age < 18){
            category = "You are juvenile";
        } else {
            category = "You are children's";
        }

        System.out.println(category);
    }
}
