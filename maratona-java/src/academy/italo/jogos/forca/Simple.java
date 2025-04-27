package academy.italo.jogos.forca;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "Banana";
        word = word.toUpperCase();
        String[] wordSplit = word.split("");

        int attempts = 6;

        while(attempts > 0){
            char letter = scanner.next().charAt(0);
            System.out.print("Digite uma letra: ");

            for(int i = 0; i < wordSplit.length; i++){

            }
            attempts--;
        }
    }
}
