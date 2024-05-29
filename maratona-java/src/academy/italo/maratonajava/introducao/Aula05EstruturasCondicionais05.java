package academy.italo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        byte day = scan.nextByte();

        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fryday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
