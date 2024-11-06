package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean value1 = scanner.nextBoolean();
        boolean value2 = scanner.nextBoolean();

        if(value1 && value2){
            System.out.println("They are True");
        } else if (!value1 && !value2){
            System.out.println("They are False");
        } else {
            System.out.println("They have different values");
        }

    }
}
