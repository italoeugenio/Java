package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        float valorDoProduto = scanner.nextFloat();
        System.out.println();

        System.out.println("Tabela de Código de Condições de Pagamento");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");

        System.out.println();
        System.out.print("Digite a opção de pagamento: ");
        int opcao = scanner.nextInt();
        int qntParcela = 0;

        switch(opcao){
            case 1 :
                System.out.println("Valor a pagar (15% DE DESCONTO): " + (valorDoProduto - (valorDoProduto * 0.15)));
                break;
            case 2 :
                System.out.println("Valor a pagar (10% DE DESCONTO): " + (valorDoProduto - (valorDoProduto * 0.10)));
                break;
            case 3 :
                qntParcela = 2;
                System.out.println("Valor a pagar por mês (SEM JUROS): " + valorDoProduto/qntParcela);
                break;
            case 4 :
                float taxaDeJuros = 0.10f;
                System.out.print("Digite a quantidade de parcelas (3 ou mais): ");
                qntParcela = scanner.nextInt();
                while(qntParcela < 2){
                    System.out.print("Digite 3 parcelas ou mais: ");
                    qntParcela = scanner.nextInt();
                }
                float jurosSimples = ((valorDoProduto * taxaDeJuros) + valorDoProduto) / qntParcela;
                System.out.printf("Valor a pagar por mês (COM JUROS SIMPLES): %.2f", jurosSimples);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
