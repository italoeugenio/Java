package academy.italo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturaDeRepeticao04 {
    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        double valorCarro = scan.nextDouble();

        for(int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
            if(valorParcela >= 1000){
                System.out.printf("Parcela: %d R$ %.2f%n", parcela, valorParcela);
            } else {
                break;
            }
        }
        scan.close();
    }
}
