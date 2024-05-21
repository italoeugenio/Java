package academy.italo.loiane.exercicios.condicionais;

import java.util.Scanner;

public class Ex04 {
    //    https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2014%2015.pdf
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva uma letra: ");
        String letter = scan.nextLine();

//        if (letter.equalsIgnoreCase("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
//            System.out.println("É uma vogal");
//        } else {
//            System.out.println("É uma consoante");
//        }
        if (letter.length() < 1) {
            switch (letter) {
                case "a":
                    System.out.println("É uma vogal");
                    break;
                case "e":
                    System.out.println("É uma vogal");
                    break;
                case "i":
                    System.out.println("É uma vogal");
                    break;
                case "o":
                    System.out.println("É uma vogal");
                    break;
                case "u":
                    System.out.println("É uma vogal");
                    break;
                default:
                    System.out.println("É uma consoante");
            }
        } else {
            System.out.println("Só pode digitar uma letra");
        }
    }

}