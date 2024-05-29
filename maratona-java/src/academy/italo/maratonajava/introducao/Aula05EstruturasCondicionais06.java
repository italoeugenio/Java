package academy.italo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        byte day = scan.nextByte();

        switch(day){
            case 1:
                System.out.println("Sunday - Business day");
                break;
            case 2:
                System.out.println("Monday - Business day");
                break;
            case 3:
                System.out.println("Tuesday - Business day");
                break;
            case 4:
                System.out.println("Thursday - Business day");
                break;
            case 5:
                System.out.println("Fryday - Business day");
                break;
            case 6:
                System.out.println("Saturday (Weekend)");
                break;
            case 7:
                System.out.println("Monday (Weekend)");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
