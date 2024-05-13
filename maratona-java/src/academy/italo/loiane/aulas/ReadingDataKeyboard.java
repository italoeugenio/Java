package academy.italo.loiane.aulas;

import java.util.Scanner;

public class ReadingDataKeyboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write your full name:");
        String name = scan.nextLine();

        System.out.print("Write your age:");
        int age = scan.nextInt();

        System.out.print("Write your height:");
        double height = scan.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
}
