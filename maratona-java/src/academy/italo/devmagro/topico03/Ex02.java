package academy.italo.devmagro.topico03;

public class Ex02 {
    public static String verificarImparOuPar(int num){
        if(num % 2 == 0){
            return "É par";
        }
        return "Não é par";
    }

    public static String verificarPositivoOuNegativo(int num){
        if(num == 0){
            return "Ele é nulo";
        } else if (num < 0){
            return "É negativo";
        }

        return "É positivo";
    }

    public static void main(String[] args) {
        int num = -2;
        System.out.println("O numero " + num + ":");
        System.out.println("- "+ verificarImparOuPar(num));
        System.out.println("- "+verificarPositivoOuNegativo(num));
    }
}
