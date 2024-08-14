package academy.italo.loiane.aulas;

import java.util.Random;

public class GerarNumerosAleatoriosParaOsExercicios {
    public static void main(String[] args) {
        Random generator = new Random();
        int QuantidadeDeNúmeros = 16;

        while(QuantidadeDeNúmeros > 0){
            int numeroAleatorio = generator.nextInt(17) + 1;
            System.out.println(numeroAleatorio);
            QuantidadeDeNúmeros--;
        }
    }
}
