package academy.italo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    //void não está retornando nada
    public void somarDoisNumeros(){
        System.out.println(10 +10);
    }

    public void subtraiDoiNumeros(){
        System.out.println(21-10);
    }

    public void multiplacaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num1 == 0 || num2 == 0){
            System.out.println("Não existe divisão por 0");
            return 0;
        } else
            return num1/num2;
    }

    public void divideDoisNumerosVersaoNova(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro alteraDoisDumeros");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //Sintaxe mais simples para array
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
