package academy.italo.devmagro.topico03;

import java.util.Random;

public class Ex21 {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);

        while(true){
            numeroAleatorio = random.nextInt(101);
            System.out.println(numeroAleatorio);
            if(numeroAleatorio == 2){
                break;
            }
        }
    }
}
