package academy.italo.loiane.aulas;

import java.util.Random;

public class GerarNumerosAleatoriosParaOsExercicios {
    public static void main(String[] args) {
        //Fiz esse gerador de numeros aleatórios para fazer 6 exercicios da lista de cada assunto
        Random generator = new Random();
        int numeroAleatorio = generator.nextInt(17) + 1;
        System.out.println(numeroAleatorio);
    }
}
